package me.ffulauh.javalang.concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    Lock lock;

    public ReentrantLockTest(){
        this.lock=new ReentrantLock(false);
//        this.lock=new ReentrantLock(true);
    }

    public void print(){
        lock.lock();
        try{
            System.out.println("aaaaaaaaaaaa");
        }finally {
            lock.unlock();
        }

        lock.lock();
        try{
            System.out.println("bbbbbbbbb");
        }finally {
            lock.unlock();
        }


    }


    private static class LockTask implements Runnable{
        ReentrantLockTest mutexTest;

        LockTask(ReentrantLockTest mutexTest){
            this.mutexTest=mutexTest;
        }

        @Override
        public void run() {
            mutexTest.print();
        }
    }

    public static void main(String[] args) {
        ReentrantLockTest lockTest=new ReentrantLockTest();
        Thread a=new Thread(new LockTask(lockTest),"aaaa");
        Thread b=new Thread(new LockTask(lockTest),"bbbb");
        Thread c=new Thread(new LockTask(lockTest),"cccc");
        Thread d=new Thread(new LockTask(lockTest),"dddd");

        a.start();
        b.start();
        c.start();
        d.start();
        System.out.println("hehe");
    }
}
