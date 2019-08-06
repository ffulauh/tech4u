package me.ffulauh.javalang.concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    public static void main(String[] args) {
        Lock lock=new ReentrantLock();
        lock.lock();
        System.out.println("hehe");
    }
}
