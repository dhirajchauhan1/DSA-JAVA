package com.dhiraj;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5,4,2,7,9},
                {10,25,71,0,81,11,12},
                {100,104,200,199}
        };
        int[][] arr1={};
        int target = 199;
        int[] ans = search(arr, target);
       // System.out.println(Arrays.toString(ans));
        System.out.println(max(arr1));
    }

    static int[] search(int[][] arr, int target){
        if (arr.length == 0)
            return new int[] {-1};

        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                if (target == arr[row][col])
                    return new int[]{row,col};
            }
        }

        return new int[] {-1};
    }

    static int max(int[][] arr){
        if (arr.length == 0)
            return Integer.MIN_VALUE;

        int max = arr[0][0];

        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                max=arr[row][col];
                if (max < arr[row][col])
                    max = arr[row][col];
            }
        }


        return max;
    }
}
