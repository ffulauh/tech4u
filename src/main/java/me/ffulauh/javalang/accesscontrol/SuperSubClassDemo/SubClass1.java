package me.ffulauh.javalang.accesscontrol.SuperSubClassDemo;

public class SubClass1 {
    public static void main(String[] args) {

    }
    void print(){
        System.out.println(new SuperClass().defaultField);  //同包
        System.out.println(new SuperClass().protectedField);  //同包

    }
}
