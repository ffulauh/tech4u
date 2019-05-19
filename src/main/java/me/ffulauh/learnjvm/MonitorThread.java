package me.ffulauh.learnjvm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MonitorThread {
    public static void createBusyThread() {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                    ;
            }
        },"testBusyThread");
    }

    public static void createLockThread(final Object lock){
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    try{
                        lock.wait();
                    } catch (InterruptedException e){
                        e.printStackTrace();

                    }
                }
            }
        },"testLockThread");
        thread.start();
    }

    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Pserson p= new Pserson();
        br.readLine();
//        createBusyThread();
//        br.readLine();
        Object obj=new Object();
        createLockThread(obj);
        System.out.println(p.name);
    }

    static class Pserson {
        String name="hehe";
    }
}
