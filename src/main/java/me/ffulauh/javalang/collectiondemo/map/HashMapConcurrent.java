package me.ffulauh.javalang.collectiondemo.map;

import java.util.HashMap;
import java.util.UUID;

public class HashMapConcurrent {
    public static void main(String[] args) throws InterruptedException {
//        final HashMap<String, String> map = new HashMap<>(2);
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10000; i++) {
//                    new Thread(new Runnable() {
//                        @Override
//                        public void run() {
//                            map.put(UUID.randomUUID().toString(), "");
//                        }
//                    }, "ftf" + i).start();
//                }
//            }
//        }, "ftf");
//        t.start();
//        t.join();
        byte a=-1;
        a+=1;
        System.out.println(a);
    }
}
