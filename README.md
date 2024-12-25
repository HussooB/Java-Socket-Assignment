# Java Socket Assignment Solution

# NAME AND ID

## Hussein Beshir 

## ID: Ugr/30697/15

## Section 2.

# Overview

This repository contains a solution for a Java-based socket programming assignment. The project demonstrates a simple client-server chat application where multiple clients can connect to a server and exchange messages in real time. The server broadcasts messages to all connected clients, creating a group chat environment.

# Repository Structure

- **Client.java**: The source code for the client-side application.
- **Client.class**: The compiled class file for the client application.
- **Server.java**: The source code for the server-side application.
- **Server.class**: The compiled class file for the server application.
- **Server\$ClientHandler.class**: The compiled class file for handling individual clients on the server.

## Features

- **Multi-client Support**: Multiple clients can connect to the server simultaneously.
- **Real-time Messaging**: Messages sent by any client are broadcast to all connected clients.
- **Threaded Architecture**: Each client connection is handled on a separate thread to ensure smooth communication.

## Requirements

- **Java Development Kit (JDK)**: Version 8 or higher.
- **Git**: To clone the repository.

## How to Run

### Step 1: Clone the Repository


$ git clone https://github.com/<your-username>/java-socket-assignment.git
$ cd java-socket-assignment

### Step 2: Compile the Code

Use the `javac` command to compile the Java files.


$ javac Server.java Client.java


### Step 3: Start the Server

Run the server program to begin listening for client connections.


$ java Server


### Step 4: Start the Clients

Run the client program in separate terminal windows to connect to the server.


$ java Client


### Step 5: Chat!

- Enter messages in any client terminal to send them.
- All connected clients will receive the messages in real time.

## How to End the Session

- To stop the server, terminate the `Server` process (e.g., press `Ctrl+C` in the terminal running the server).
- To close a client, terminate the `Client` process (e.g., press `Ctrl+C` in the terminal running the client).


