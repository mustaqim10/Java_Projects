package com.StringandArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateArry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length or the size of the Array: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        int arr[] = new int[size];
        int newArray[] = new int[size];

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the value in an array at index " +(i+1)+ ": ");
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // traditional approach

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    arr[j] = 0;
                }
            }

        }

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] != 0){
                newArray[i] = arr[i];
                System.out.println(newArray[i]);
            }
        }
//        System.out.println("check the new array is assigned properly or not.");
//        System.out.println(newArray[3]);

        // using collection how to remove duplicate elements inside an array.
//        List<Integer> prime = new ArrayList<>();
//        for (int i = 0; i < size ; i++) {
//            prime.add(arr[i]);
//        }
//        Set<Integer> primewithduplicates = new LinkedHashSet<>(prime);
//        prime.clear();
//        prime.addAll(primewithduplicates);
//        System.out.println("List of prime without duplicates: "+ prime);
    }
}

