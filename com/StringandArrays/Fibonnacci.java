package com.StringandArrays;

import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for which the fibbonaci series to be removed: ");
        number = scanner.nextInt();
        scanner.close();

        int[] arr = new int[number];
        arr[0] = 0;
        arr[1] = 1;
        System.out.println(arr[0]+ "\n" + arr[1]);
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            System.out.println(arr[i]);

        }
    }

}
