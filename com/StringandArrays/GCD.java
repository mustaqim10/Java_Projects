package com.StringandArrays;


import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,a,b;
        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();

        if(a < b){
            i = a;
        }
        else
            i = b;

        int gcd = 0;

        for (int j = i; j > 1; j--) {
            if(a%j == 0 && b%j == 0){
                gcd = j;
                break;
            }
        }
        System.out.println("greatest common divisor of "+ a + " and " + b + " is: "+ gcd);
    }
}
