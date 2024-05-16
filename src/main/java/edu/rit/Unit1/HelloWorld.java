package edu.rit.Unit1;

public class HelloWorld {
    static final double PI_VALUE = 3.1421453125;

    public static void main(String[] args) {
        String myString = "Hello RIT";
        byte myByte = -123;
        short myShort = 1235;
        int myInt = 5555555;
        long myLong = 100000000000L;
        float myFloat = 123.12F;
        double myDouble = -123.2133213;
        boolean myBoolean = false;
        char myChar = myString.charAt(2);

        int age = 23;

        // PI_VALUE = 15;

        // HELLO THIS IS A COMMENT AND IT IS IGNORED BY THE COMPILER
        /*
        *
        * Hello this is a multi line comment
        */

        System.out.println(age);
        age += 1;
        System.out.println(age);
        // System.out.println((byte) (myByte - (byte) 10));
        System.out.println(myChar);

    }
}
