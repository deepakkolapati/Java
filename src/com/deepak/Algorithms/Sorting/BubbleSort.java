package com.deepak.Algorithms.Sorting;

public class BubbleSort {

    public static void sort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){

            for(int k:arr){
                System.out.print(k+" ");
            }
            System.out.println();

            boolean swap = false;
            for(int j=0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr= {4,6,2,1,9,0,56,43,23,78,91,23};
        sort(arr);


    }

}
