package edu.rit.Unit1;

@SuppressWarnings("ConstantValue")
public class Conditionals {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        // == only works for primitive types
        if (a == b) {
            System.out.println("Equal");
        } else if (a != b) {
            System.out.println("Not equal");
        }

        if (!(a == b))
            System.out.println(true);

        if (a == b || 3 == 3)
            System.out.println("Hello");

        if (a == b && 3 == 3)
            System.out.println("Hello again");
        else
            System.out.println("Nothing");

        String hello = "Hello";
        String hello1 = "World";

        // with objects never use ==
    //    System.out.println(hello == hello1);

        System.out.println(!hello.equals(hello1));
    }
}
