package com.dsa.basics;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if its a palindrome: ");

        String original = scanner.nextLine();
        scanner.close();

        original = original.toLowerCase();
        int length = original.length();
        boolean isPalindrome = true;
        int start =0, end = length-1;

        while(start<end){
            if(original.charAt(start)!=original.charAt(end)){
                isPalindrome= false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome){
            System.out.println("The "+ original+ " is a palindrome");
        }
        else{
            System.out.println("The "+ original+ " is not a palindrome");
        }


    }
}
