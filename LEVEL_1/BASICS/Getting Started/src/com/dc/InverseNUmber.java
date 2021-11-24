package com.dc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InverseNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ans = new int[(n+"").length()];
        int index = 0;
        int num = 1;

        while(n!=0){

            index = n%10;
            ans[index-1] = num;
            num++;
            n=n/10;
        }

        for (int i:ans){
            System.out.print(i);
        }

    }
}
