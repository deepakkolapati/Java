package com.deepak.Algorithms.binarysearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){
        int length = arr.length;
        int start=0,end=length-1;

        while(start<=end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }


    public static int binarySearchRecursive(int[] arr,int target, int start, int end ){
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {2,4,6,7,9,10,13,17,84,99,101,234,314,360,432,544,545,600,728};

        int[] targets = {4,10,17,234,360,544,728,2,545,600};
        for(int i: targets){
            System.out.println("The element "+ i + " found at index "+ binarySearch(arr,i));
        }

    }
}
