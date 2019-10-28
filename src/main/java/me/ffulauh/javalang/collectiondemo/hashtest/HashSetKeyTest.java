package me.ffulauh.javalang.collectiondemo.hashtest;

import java.util.HashSet;
import java.util.Set;

public class HashSetKeyTest {
    public static void main(String[] args) {
        User han=new User("han",21);
        User han2=new User("shao",21);
        Set users=new HashSet();
        users.add(han);
        users.add(han2);
    }

}
