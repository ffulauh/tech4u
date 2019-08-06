package me.ffulauh.javalang.threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalDemo {


    public static void main(String[] args) {
        ThreadLocal<String> str=new ThreadLocal<String>(){
            @Override
            protected String initialValue() {
                return Thread.currentThread().getName();
            }
        };
        ThreadLocal<Long> id=new ThreadLocal<Long>(){
            @Override
            protected Long initialValue() {
                return Thread.currentThread().getId();
            }
        };
        ExecutorService service= Executors.newFixedThreadPool(3);
        service.execute(new Job(str,id));
        service.execute(new Job(str,id));
        service.shutdown();
    }

    static class Job implements Runnable{
        ThreadLocal<String> str;
        ThreadLocal<Long> id;

        Job(ThreadLocal<String> str,ThreadLocal<Long> id){
            this.str=str;
            this.id=id;
        }
        @Override
        public void run() {
            System.out.println(str.get());
            System.out.println(id.get());
        }
    }


}

