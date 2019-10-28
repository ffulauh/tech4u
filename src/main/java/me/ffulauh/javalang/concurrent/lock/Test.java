package me.ffulauh.javalang.concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        Lock lock=new ReentrantLock();
        lock.lock();
        lock.unlock();
    }
}
