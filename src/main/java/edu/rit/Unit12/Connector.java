package edu.rit.Unit12;

import java.io.IOException;
import java.net.Socket;

public class Connector {

    public static void main(String[] args) throws IOException {
       // Socket socket = new Socket("www.google.com",80);
     //   Socket socket = new Socket("swec-123.rit.edu",33075);
        Socket socket = new Socket("localhost",1234);

    }
}

