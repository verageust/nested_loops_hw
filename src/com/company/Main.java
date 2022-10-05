package com.company;

public class Main {

    public static void main(String[] args) {
        homework41();
    }

    static void homework11() {
        for (int row = 1; row <= 5; row++) {
            for (int n = 1; n <= 5; n++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    static void homework12() {
        for (int row = 1; row <= 5; row++) {
            for (int n = row; n <= row + 4; n++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    static void homework34() {
        int[] nums = {3, 7, 4};
        for (int k = 0; k < nums.length; k++)
            for (int l = 0; l < nums.length; l++) {
                if (k != l)
                    System.out.println(10 * nums[k] + nums[l]);
            }
    }

    static void homework41() {
        for (int row = 1; row <= 6; row++) {
            String symbol = "*";
            for (int col = 6; col >= row; col--)
                System.out.print(symbol);

            System.out.println();
        }
    }

    static void homework42()

    {
        for (int row = 1; row <= 6; row++) {
            String symbol = "*";
            for (int col = 1; col >= row; col++) {
                System.out.print(symbol);

                System.out.println(); // makes a new line
            }

        }
    }
}
