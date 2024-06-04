package edu.rit.Unit10.review;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public interface Operation {
        double execute(double left, double right);
    }

    public static Operation getOperation(String operation) {
        if (operation.equals("+"))
            return new Operation() {
                @Override
                public double execute(double left, double right) {
                    return left + right;
                }
            };
        else if (operation.equals("-"))
            return (left, right) -> left - right;
        else if (operation.equals("*"))
            return (left, right) -> left * right;
        else if (operation.equals("/"))
            return (left, right) -> left / right;
        else if(operation.equals("^"))
            return Math::pow;

        throw new UnsupportedOperationException(operation + " is not supported.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double left = 0;
        double right = 0;
        String operator = null;

        while (true) {
            try {
                left = scanner.nextDouble();
                operator = scanner.next();
                right = scanner.nextDouble();
                Operation operation = getOperation(operator);
                System.out.printf("%.2f %s %.2f = %.2f%n", left, operator, right, operation.execute(left, right));
            } catch (InputMismatchException ime) {
                break;
            }
        }
    }
}
