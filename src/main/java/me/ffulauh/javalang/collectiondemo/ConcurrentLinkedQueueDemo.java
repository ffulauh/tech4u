package me.ffulauh.javalang.collectiondemo;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue=new ConcurrentLinkedQueue<>();
        for(int i=0;i<5;i++){
            queue.offer(i+"");
        }
    }
}
