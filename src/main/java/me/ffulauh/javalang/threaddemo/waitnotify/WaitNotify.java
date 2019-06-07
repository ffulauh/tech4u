package me.ffulauh.javalang.threaddemo.waitnotify;

import me.ffulauh.javalang.threaddemo.Interrupted;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WaitNotify {

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
//            lock.lock();
                System.out.println("我开始睡觉了");
//                condition.awaitUninterruptibly();
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
//                wait.interrupt();
            lock.lock();
                try{
//                    TimeUnit.SECONDS.sleep(2);
                    condition.signal();
                } finally {
                    lock.unlock();
                }
//                System.out.println("我换醒别的线程");
//
//            }
//            System.out.println("heheh");
        }
    }
}
