package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> list=new ArrayList();
        list.add("Amir");
        list.add("Hatef");
        list.add("Mehran");
        list.add("Mojtaba");
        list.add("Mohammad");
        list.add("Ali");
        list.add("Davood");
        list.add("Reza");
        list.add("Mohsen");
        Map<Integer, List<String>> result =
                list.stream().collect(
                        Collectors.groupingBy(
                                t-> t.length()
                                ,Collectors.toList()
                        )
                );

//        Map<Integer, String> result =
//                list.stream().collect(
//                        Collectors.groupingBy(
//                                t-> t.length()
//                                ,Collectors.counting().toString()+""+Collectors.toList().toString()
//
//                        )
//                );
//        List list1= (List) result.values();
//        Map<List<String>,Long> result1=list1.stream().collect(Collectors.groupingBy(Function.identity(),t->t.size()));
        System.out.println(result);
    }
}
