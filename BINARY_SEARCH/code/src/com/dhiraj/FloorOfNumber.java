package com.dhiraj;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr ={1,3,4,6,7,8,10,14};
        int[] arr1 ={14,10,8,7,6,4,3,1};

        //System.out.println(floorInAscending(0,arr));
        System.out.println(floorInDescending(0,arr1));
    }

    //return -1 if no smaller element found than target or target not found
    //otherwise return the number
    static int floorInAscending(int target, int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        while (start <= end){
            mid = (start+end)/2;
            if (target==arr[mid])
                return arr[mid];
            else if (target > arr[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        if (end == -1)
            return -1;
        return arr[end];
    }

    //return -1 if no smaller element found than target
    //otherwise return the number
    static int floorInDescending(int target, int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        while (start <= end){
            mid = (start+end)/2;
            if (target==arr[mid])
                return arr[mid];
            else if (target > arr[mid])
                end = mid-1;
            else
                start = mid+1;
        }
        if (start == arr.length)
            return -1;
        return arr[start];
    }
}
