package edu.rit.Unit1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello " + name);

            System.out.print("Your age: ");
            int age = scanner.nextInt();
            System.out.println("Your age is " + age);

            scanner.close();
        } catch (InputMismatchException ime) {
            System.out.println("The age is invalid.");
        }

        // this is the equivalent of using in python, this will close the scanner when the try/catch block finishes
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello " + name);

            System.out.print("Your age: ");
            int age = scanner.nextInt();
            System.out.println("Your age is " + age);
        } catch (InputMismatchException ime) {
            System.out.println("The age is invalid.");
        }


    }
}
