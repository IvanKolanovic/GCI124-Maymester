package edu.rit.Unit12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);

        while (true) {
            System.out.println("Waiting for client to connect...");
            Socket client = ss.accept();
            System.out.println("Accepted client from: " + client.getInetAddress());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String line = bufferedReader.readLine();
            if(line != null)
                System.out.println(line);
        }
    }
}
