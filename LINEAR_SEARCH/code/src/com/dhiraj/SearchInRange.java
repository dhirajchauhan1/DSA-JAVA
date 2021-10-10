package com.dhiraj;

public class SearchInRange {

    public static void main(String[] args) {
        int[] arr={1,8,5,6,71,0};
        System.out.println(linearSearchInRange(arr, 71, 1,4));
    }

    static int linearSearchInRange(int[] arr, int target, int start, int end){
        if (arr.length==0)
            return -1;

        for (int i=start; i<=end; i++){
            if (target==arr[i])
                return i;
        }

        return -1;
    }

}
