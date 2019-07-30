package me.ffulauh.javalang.threaddemo.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        Me me=new Me();
        me.setName("me");
        ExecutorService service= Executors.newFixedThreadPool(3);
        MeHolder meHolder=new MeHolder(me);
        for(int i=0;i<2;i++){
            service.execute(new Task(meHolder));
        }
        service.shutdown();
    }

}
