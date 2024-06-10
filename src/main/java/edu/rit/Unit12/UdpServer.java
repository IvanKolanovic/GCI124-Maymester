package edu.rit.Unit12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[1024];
        DatagramPacket incoming = new DatagramPacket(buffer,buffer.length);
        DatagramSocket socket  = new DatagramSocket(8080);
        while(true) {
            socket.receive(incoming);
            String message = new String(incoming.getData(), 0, incoming.getLength());
            System.out.println(message);
        }
    }
}
