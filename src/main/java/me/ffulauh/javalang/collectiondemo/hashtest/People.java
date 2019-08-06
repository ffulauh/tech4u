package me.ffulauh.javalang.collectiondemo.hashtest;

import java.util.HashMap;
import java.util.Map;

public class People {

    int age;
    String name;

    public People(String name,int age){
        this.age=age;
        this.name=name;
    }

    @Override
    public int hashCode() {
        return age%2;
    }

    public static void main(String[] args) {
        Map<People,String> hehe=new HashMap<>();
        People p1=new People("1",22);
        hehe.put(new People("1",24),"hehe");
        hehe.put(new People("2",48),"haha");
        System.out.println("hehe");
    }
}
