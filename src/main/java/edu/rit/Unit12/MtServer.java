package edu.rit.Unit12;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MtServer {
    // Socket variables
    public static final int SERVER_PORT = 8080;
    private ServerSocket ss;
    private int clientCounter;

    public MtServer() {
        this.ss = null;
        this.clientCounter = 0;
        ServerThread st = new ServerThread();
        st.start();
    }

    class ServerThread extends Thread {
        @Override
        public void run() {
            try {
                ss = new ServerSocket(SERVER_PORT);
            } catch (IOException ioe) {
                System.err.println("IO Exception (1): " + ioe.getMessage());
                return;
            }

            while (true) {
                Socket client = null;

                try {
                    System.out.println("Waiting for a client to connect...");
                    client = ss.accept();
                } catch (IOException e) {
                    System.err.println("IO Exception (2): " + e.getMessage());
                    return;
                }
                System.out.println("A client has connected.");
                ClientThread ct = new ClientThread(client, "Client " + clientCounter);
                ct.start();
                clientCounter++;
            }
        }
    }


    class ClientThread extends Thread {
        private Socket clientSocket;
        private String clientName;

        public ClientThread(Socket clientSocket, String name) {
            this.clientName = name;
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            System.out.println("Client connected: " + clientName);
            PrintWriter pwt = null;
            Scanner scanner = null;

            try {
                pwt = new PrintWriter(clientSocket.getOutputStream());
                scanner = new Scanner(clientSocket.getInputStream());

                while (true) {
                    if(!scanner.hasNext()) continue;
                    String line = scanner.nextLine();
                    System.out.println("Server Received[" + this.clientName + "]: " + line);
                    System.out.println("Server Reply[" + this.clientName + "]: Hello, how are you today.");
                    pwt.write("Hello, how are you today.");
                    pwt.flush();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                pwt.close();
                scanner.close();
                try {
                    this.clientSocket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        new MtServer();
    }
}
