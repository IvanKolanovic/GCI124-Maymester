package edu.rit.Unit1;

public class LearningJava {

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static void print(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        double x = 23;
        double y = 2.5;
        double result = multiply(x, y);
        print(String.valueOf(result));
        print("Hello world" + " !" + 5);
        print("" + 23);

        System.out.println("5 + 3 = " + (5 + 3));
        System.out.println("12 * 3.6 = " + (12 * 3.6));
        System.out.println("2.7 * 4.1 = " + (2.7 * 4.1));
        System.out.println("10 / 4 = " + (10 / 4));

        String hello;
        hello = "Hello";
        char letter = hello.charAt(0);
        System.out.println(letter);

        int a = 12;
        a = (int) 23.5;
        double b = 123.2;
        b = 12;
        double power = Math.pow(4, 2);
        System.out.println(power);

        int result1 = 4 / 3;
        System.out.println(result1);
        double result2 = 4 / 3.0;
        System.out.println(result2);


        String c = "helllo";
        System.out.println(c.charAt(0));
    }
}
