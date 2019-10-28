package me.ffulauh.javalang.concurrent.threaddemo.waitnotify;

import java.util.concurrent.TimeUnit;

public class ObjectWaitNotify {
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread wait = new Thread(new ObjectWaitNotify.Wait(), "wait");
        Thread notify = new Thread(new ObjectWaitNotify.Notify(wait), "notify");
        wait.start();
        notify.start();
    }


    static class Wait implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                boolean ii = Thread.currentThread().isInterrupted();
                System.out.println("我开始睡觉了");
                //获取锁后才能调用，否则抛出非法监视器状态异常
                try {
                    lock.wait();
                    System.out.println("打断前的状态：" + Thread.interrupted());
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    System.out.println("我被打断了");
                    System.out.println("打断后的状态：" + Thread.interrupted());
                }
            }
        }
    }

    static class Notify implements Runnable {
        Thread wait;

        Notify(Thread wait) {
            this.wait = wait;
        }

        @Override
        public void run() {

//            wait.interrupt();
            synchronized (lock) {
                wait.interrupt();
                //获取锁后才能调用，否则抛出非法监视器状态异常
                lock.notify();
            }

        }
    }
}
