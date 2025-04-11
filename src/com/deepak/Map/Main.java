package com.deepak.Map;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Deepak",1);
        map.put("joshi",2);
        map.put("ayush",3);
        System.out.println(map.get("joshi"));
        System.out.println(map.get("joshii"));
        System.out.println(map.getOrDefault("ayushh",10));
        System.out.println(map.containsKey("Deepak"));

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

        String s = "12";
        int num = Integer.parseInt(s);
    }

}
