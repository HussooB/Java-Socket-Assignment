import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    private static List<PrintWriter> clients = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(3300);
        System.out.println("Server started...");
        while (true) {
            Socket client = serverSocket.accept();
            System.out.println("Client connected.");
            new Thread(() -> handleClient(client)).start();
        }
    }

    private static void handleClient(Socket socket) {
        try (
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true)
        ) {
            synchronized (clients) {
                clients.add(out);
            }

            String message;
            while ((message = in.readLine()) != null) {
                synchronized (clients) {
                    for (PrintWriter client : clients) {
                        client.println(message);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
