package com.bootcampexcercise.module2.activity;

public class Calculator {
    public static void main(String args[]) {
        int x = 4;
        int y = 3;
        int[] nums = {1, 2, 3, 4};
        System.out.println("Addition = " + add(x, y));
        System.out.println("Subtraction = " + subtract(x, y));
        System.out.println("Multiply - " +multiply(nums));
        System.out.println("Divide = " + divide(x, y));
    }

    //method  of calculation
    private static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
//method of subtraction
    private static int subtract(int x, int y) {
        int diff = x - y;
        return diff;
    }
//method of multiplying
    private static int multiply(int[] numbers) {
        int temp=1;
        for (int i=0; i < numbers.length; i++) {
            temp= temp * numbers [i];
        }
        return temp;
    }
//method of division
    private static int divide(int x, int y) {
        int divValue = 0;
        if (x == 0 && y == 0) {
            System.out.println("Dividing impossibble");
        } else if (y == 0) {
            System.out.println("Division impossible");
        } else if (x == 0) {
            System.out.println("division impossible");
        } else {
            divValue= x / y;
        }
        return divValue;
    }
}


