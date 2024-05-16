package edu.rit.Unit1;

public class Casting {
    public static void main(String[] args) {
        float a = (float) 123525.3235235325325352334525;
        System.out.println(a);
        int b = (int) a;
        System.out.println(b);
        int c = 'a';
        System.out.println(c);
        int d = (int) 3000000000000000000L;
        System.out.println(d);
    }
}
