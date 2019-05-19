package me.ffulauh.javalang.accesscontrol.SuperSubClassDemo2;

import me.ffulauh.javalang.accesscontrol.SuperSubClassDemo.SuperClass;

public class SubClass2 extends SuperClass {
    public static void main(String[] args) {
    }

    void print(){
        System.out.println(this.protectedField);    //不同包，子类
        System.out.println(new SuperClass().publicField);   //不同包
    }
}
