package me.ffulauh.javalang.concurrent.threaddemo.waitnotify;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionWaitNotify {

//    static Object lock=new Object();
    static Lock lock=new ReentrantLock();
    static Condition condition=lock.newCondition();



    public static void main(String[] args) {
        Thread wait=new Thread(new Wait(),"wait");
        Thread notify=new Thread(new Notify(wait),"notify");
        wait.start();
        notify.start();
    }


    static class Wait implements Runnable{
        @Override
        public void run() {
//            synchronized (lock){
            lock.lock();
            boolean ii=Thread.currentThread().isInterrupted();
                System.out.println("我开始睡觉了");
                //获取锁后才能调用，否则抛出非法监视器状态异常
//            condition.awaitUninterruptibly();
//                condition.awaitUntil(new Date())
                try{
                    condition.await();
                    System.out.println("打断前的状态："+Thread.interrupted());
                    TimeUnit.SECONDS.sleep(5);
                }catch (InterruptedException e){
                    System.out.println("我被打断了");
                    System.out.println("打断后的状态："+Thread.interrupted());
                } finally {
                    lock.unlock();
                }
//            }
        }
    }

    static class Notify implements Runnable{
        Thread wait;
        Notify(Thread wait){
            this.wait=wait;
        }
        @Override
        public void run() {
//            try{
//                TimeUnit.SECONDS.sleep(2);
//            }catch (InterruptedException e){
//            }
//            wait.interrupt();
//            synchronized (lock){
            lock.lock();
            wait.interrupt();
            try{
//                    TimeUnit.SECONDS.sleep(2);
                    //获取锁后才能调用，否则抛出非法监视器状态异常
                    condition.signal();
                } finally {
                    lock.unlock();
                }

        }
    }
}
