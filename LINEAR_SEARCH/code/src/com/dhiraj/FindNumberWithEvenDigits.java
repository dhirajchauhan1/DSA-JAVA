package com.dhiraj;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindNumberWithEvenDigits {
    public static void main(String[] args) {
        int[] arr={2000,5,8,46,2,9,7,3010};
        System.out.println(countEven1(arr));
    }

    static int countEven(int[] nums){
        int count=0;
        for (int num:nums){
            if ((num+"").length() % 2 ==0)
                count++;
        }
        return count;
    }

    //fastest runtime
    static int countEven1(int[] nums){
        int count=0;
        for (int num:nums){
            if (((int)(Math.log10(num)+1)) % 2 ==0)
                count++;
        }
        return count;
    }

    static int countEven2(int[] nums){
        int count=0;
        for (int num:nums){
            if (isEvenDigits(num))
                count++;
        }
        return count;
    }

    private static boolean isEvenDigits(int num) {
        int count = 0;
        while (num > 0){
            num = num/10;
            count++;
        }

        return count % 2 == 0;
    }
}
