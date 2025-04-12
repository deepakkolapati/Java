package com.deepak.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,2,3,8,9);
//        Stream<Integer> s1 =nums.stream().filter(n-> n%2==0);
//        s1.forEach(n-> System.out.println(n));
//        Stream<Integer> s2 = s1.map(n-> n*2);
//        s2.forEach(n-> System.out.println(n));
//        int result = s2.reduce(0,(i,j)->i+j);
//        System.out.println(result);

//        int result = nums.stream().filter(n-> n%2==0).sorted()
//                                  .map(n-> n*2)
//                                  .reduce(0,(i,j)->i+j);

//        System.out.println(result);

        Stream s= nums.stream().filter(n-> n%2==0).map(n-> n*2).sorted();
        s.forEach(n-> System.out.println(n));
    }
}
