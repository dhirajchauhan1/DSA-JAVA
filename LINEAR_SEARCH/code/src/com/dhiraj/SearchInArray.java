package com.dhiraj;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr={2,5,8,46,2,9,7,3,0};
        System.out.println(linearSearch(arr, 46));
    }

    //return the index if item found otherwise -1
    static int linearSearch(int [] arr, int n){
        if(arr.length == 0)
            return -1;

        for (int i=0; i<arr.length; i++)
            if (n==arr[i])
                return i;

        return -1;
    }
    //return true if item found otherwise false
    static boolean linearSearch2(int [] arr, int n){
        if(arr.length == 0)
            return false;

        for (int i=0; i<arr.length; i++)
            if (n==arr[i])
                return true;

        return false;
    }

}
