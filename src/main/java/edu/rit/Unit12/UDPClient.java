package edu.rit.Unit12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        String message = "Hello, my name is Ivan Kolanovic";

        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getLocalHost(), 8080);
        DatagramSocket so = new DatagramSocket();
        so.send(packet);
    }
}
