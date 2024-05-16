package edu.rit.Unit1;

public class Loops {

    public static int countWhile(int n) {
        int sum = 0;
        int current = 0;
        while (current <= n) {
            if (current == 10) {
                current++;
                continue;
            } else if (current == 85) {
                break;
            } else if (current == 65) {
                return 10;
            }
            System.out.println(current);
            sum += current;
            current++;
        }
        return sum;
    }

    public static int countFor(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += 1;
            System.out.println(i);
        }
        return sum;
    }


    public static void main(String[] args) {
        //int sum = countWhile(100);
        //System.out.println(sum);
        int newSum = countFor(100);
        System.out.println(newSum);
    }
}
