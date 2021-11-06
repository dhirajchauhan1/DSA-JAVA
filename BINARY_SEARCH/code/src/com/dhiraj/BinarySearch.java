package com.dhiraj;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(arr,1));
        int[] arr1 ={10,9,8,7,6,5,4,3,2,1};
      //  System.out.println(search2(arr1,7));
     //   System.out.println(OrderAgnosticBs(arr1,7));
    }

    //in case in ascending order sorted
    // return index
    static int search(int[] arr, int target){
        if (arr.length == 0)
            return -1;

        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = (start+end)/2;
            if (target == arr[mid])
                return mid;
            if (target > arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }

        return -1;
    }

    //in case in descending order sorted
    static int search2(int[] arr, int target){
        if (arr.length == 0)
            return -1;
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = (start+end)/2;
            if (target == arr[mid])
                return mid;
            if (target > arr[mid])
               end=mid-1;
            else
                start=mid+1;
        }

        return -1;
    }

    static int OrderAgnosticBs(int[] arr, int target){
        if (arr[0]<arr[arr.length-1])
            return search(arr, target);
        else
            return search2(arr, target);
    }
}
