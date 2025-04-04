package com.deepak.exceptions;

public class Main {

    public static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("dont divide with 0");
        }
        return a/b;
    }
    public static void main(String[] args) {
        int a =10;
        int b =0;
        try{
            divide(a,b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally");
        }
    }
}
