package me.ffulauh.javalang.collectiondemo.hashtest;

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyTest {
    public static void main(String[] args) {
        User han=new User("han",21);
        User han2=new User("shao",21);
        Map map=new HashMap();
        map.put(han,"han");
        map.put(han2,"shao");
        System.out.println(han.equals(han2));
    }
}
