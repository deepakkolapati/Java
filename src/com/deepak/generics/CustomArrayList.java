package com.deepak.generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private  static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    private boolean isFull() {
        return size == data.length?true:false;
    }

    private void reSize() {
        int[] temp =  new int[data.length*2];
        for(int i=0;i< data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public void add(int n){
        if(isFull()){
            reSize();
        }
        data[size++] = n;
    }

    public int get(int index){
        if (index<size){
            return data[index];
        }
        return -1;
    }

    public int remove(int index){
        if(index>= size){
            return 0;
        }
        int n = data[index];
        for(int i=index;  i< size-1;i++){
            data[i]= data[i+1];
        }
        data[--size] = 0;
        return n;

    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList num = new CustomArrayList();
        num.add(2);
        num.add(4);
        num.add(5);
        System.out.println(num);
        System.out.println("element at index 1 is " + num.get(1) );
        num.remove(1);
        System.out.println(num);
        num.add(5);
        num.add(7);
        System.out.println(num);
        num.remove(0);
        System.out.println(num);


    }
}
