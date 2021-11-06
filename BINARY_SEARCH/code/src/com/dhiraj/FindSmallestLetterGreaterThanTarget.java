package com.dhiraj;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'f'));
    }

   static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while (start <= end){
            mid = (start+end)/2;
            if(target==arr[mid])
                start=start+1;
            else if (target > arr[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return arr[start%arr.length];
    }
}
