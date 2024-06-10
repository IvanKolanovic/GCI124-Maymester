package edu.rit.Unit12;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Name {

    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1",8080);
        OutputStream outputStream = client.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.println("Ivan Kolanovic");
        printWriter.flush();
        printWriter.close();
    }
}
