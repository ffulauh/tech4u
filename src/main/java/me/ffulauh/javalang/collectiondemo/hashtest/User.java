package me.ffulauh.javalang.collectiondemo.hashtest;

public class User {
    String name;
    int age;

    public User(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        return ((User)obj).name.equals(name);
    }
}
