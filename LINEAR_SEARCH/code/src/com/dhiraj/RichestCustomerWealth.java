package com.dhiraj;

import java.util.Arrays;

//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][]accounts = {{2,8,7},{7,1,3},{1,9,5}};

        System.out.println(maximumWealth1(accounts));

    }

    static int maximumWealth(int[][] accounts) {

        int m = accounts.length;
        int[] ans =  new int[m];

        for (int row=0; row<accounts.length; row++){
            for (int col=0; col<accounts[row].length; col++){
                ans[row] += accounts[row][col];
            }
        }

        return Arrays.stream(ans).max().getAsInt();
    }

    static int maximumWealth1(int[][] accounts) {

        int max = Integer.MIN_VALUE;

        for (int row=0; row<accounts.length; row++){
            int rowSum = 0;
            for (int col=0; col<accounts[row].length; col++){
                rowSum += accounts[row][col];
            }
            max= rowSum>max?rowSum:max;
        }
        return max;
    }
}
