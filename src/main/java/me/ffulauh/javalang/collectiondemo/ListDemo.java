package me.ffulauh.javalang.collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
//        List aList=new ArrayList();
//        aList.add("hehe");
//        System.out.println("hehe");

        List<String> lList=new LinkedList<>();
        for(int i=0;i<5;i++){
            lList.add(i+"");
        }
        lList.indexOf("2");
        lList.get(3);
        System.out.println("hehe");
    }
}
