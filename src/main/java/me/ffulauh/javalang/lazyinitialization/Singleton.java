package me.ffulauh.javalang.lazyinitialization;

public class Singleton {

    private volatile static Singleton uniqueInstance;

    public static Singleton getInstance(){
        if(uniqueInstance ==null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
    private Singleton(){}


//    private static class SingletonHolder{
//        public static Singleton singleton=new Singleton();
//    }
//
//    public static Singleton getInstance(){
//        return SingletonHolder.singleton;
//    }

}
