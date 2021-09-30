package Singleton;

/*
To design a Singleton class,
 1. Make constructor private
 2. Write a static method that has return type of this class
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

class Singleton {
    private static Singleton obj;
    public String msg;

    private Singleton() {
        msg = "Hey! This is a Singleton class";
    }

    public static Singleton getObj() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }
}

public class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getObj();
        System.out.println(singleton.msg);
//        ArrayList<Integer> list=new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
//        System.out.println(list);
//        List<Integer> collect = list.stream().filter(element -> element % 2 == 0).map(element -> element * 2).collect(Collectors.toList());
//        Set<Integer> setFromList = list.stream().map(element -> element * 2).collect(Collectors.toSet());
//        System.out.println(setFromList);
//        System.out.println(collect);
//
//        Collection<String> collection = Arrays.asList("a", "b", "c");
//        Stream<String> streamOfCollection = collection.stream();        // creating a stream from a collection
//        streamOfCollection.forEach(ele -> System.out.print(ele + " "));
//
//        Random random = new Random();
//        DoubleStream doubleStream = random.doubles(3);
//        doubleStream.forEach(ele -> System.out.println(ele));
    }
}
