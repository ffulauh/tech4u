package me.ffulauh.javalang.concurrent;

public class DeadLockDemo {
    private static Object lockA=new Object();
    private static Object lockB=new Object();

    private static void deadLock(){
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockA){
                    try{
                        Thread.currentThread().sleep(3000);
                    } catch (Exception e){}
                    synchronized (lockB){
                        System.out.println("1");
                    }
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockB){
                    synchronized (lockA){
                        System.out.println("2");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        deadLock();
    }

}
