package com.deepak.generics;

import java.util.Arrays;

public class CustomGenArrayList <T>{
    private Object[] data;
    private int size=0;
    private static int DEFAULT_SIZE= 10;

    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T n){
        if(isFull()){
            reSize();
        }
        data[size++] = n;
    }

    private void reSize() {
        Object[] temp = new Object[data.length*2];
        for(int i=0;i< data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return data.length == size?true:false;
    }

    public T remove(int index){
        if(index>=size){
            return null;
        }
        T n = (T)(data[index]);
        for(int i=index;i<size;i++){
            data[i] = data[i+1];
        }
        data[--size]= null;
        return n;
    }

    public T get(int index){
        if(index>=size){
            return null;
        }
        return (T)(data[index]);
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> num = new CustomGenArrayList();
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

        System.out.println("--------------------------------");

        CustomGenArrayList<String> str = new CustomGenArrayList();
        str.add("abc");
        str.add("hii");
        str.add("hello");
        System.out.println(str);
        System.out.println("element at index 1 is " + str.get(1) );
        str.remove(1);
        System.out.println(str);
        str.add("5");
        str.add("7");
        System.out.println(str);
        str.remove(0);
        System.out.println(str);


    }

}
