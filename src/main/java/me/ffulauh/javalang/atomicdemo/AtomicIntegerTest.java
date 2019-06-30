package me.ffulauh.javalang.atomicdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    static AtomicInteger integer=new AtomicInteger(1);

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i=0;i<3;i++){
            service.execute(new Runnable() {
                @Override
                public void run() {

                }
            });
        }
        service.shutdown();
    }
}
