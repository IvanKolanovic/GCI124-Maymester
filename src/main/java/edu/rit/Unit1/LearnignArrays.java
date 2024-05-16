package edu.rit.Unit1;

import java.util.Arrays;

public class LearnignArrays {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 5;
        array[1] = 10;
        array[2] = 15;
        array[3] = 20;
        array[4] = 25;
        System.out.println(Arrays.toString(array));

        int[] newArray = new int[100];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println(newArray[i]);
//        }

        for (int value : newArray) {
            System.out.println(value);
        }

        int[][] array2d = new int[5][5];
        int[][] filledArray2d = {{1, 2, 3}, {4, 5, 6}};
        int[] filledArray = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < filledArray2d.length; i++) {
            for (int j = 0; j < filledArray2d[i].length; j++) {
                System.out.println(filledArray2d[i][j]);
            }
        }

        for (int[] ints : filledArray2d) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }

    }
}
