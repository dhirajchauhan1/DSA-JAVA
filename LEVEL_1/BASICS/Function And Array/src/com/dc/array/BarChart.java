package com.dc.array;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max)
                max = arr[i];
        }

        for (int floor=max; floor>=1; floor--){
            for (int i=0; i<arr.length; i++){
                if(floor<=arr[i]){
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");

            }
            System.out.println("");
        }
    }
}
