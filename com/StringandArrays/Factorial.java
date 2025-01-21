package com.StringandArrays;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number, for the factorial to be removed: ");
        num = scanner.nextInt();
        scanner.close();

        int sum = 1;
        for (int i = 1; i <= num ; i++) {
            sum = sum * i;
            System.out.println(sum);
        }
    }
}
