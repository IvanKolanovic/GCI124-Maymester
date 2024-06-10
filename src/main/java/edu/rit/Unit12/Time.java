package edu.rit.Unit12;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class Time {

    public static void main(String[] args) throws IOException {
        Socket client = new Socket("time.nist.gov",13);
        InputStream inputStream = client.getInputStream();
        Scanner sc = new Scanner(inputStream);

        while (sc.hasNext()){
            System.out.println(sc.next() + " ");
        }
        sc.close();
        client.close();
    }
}
