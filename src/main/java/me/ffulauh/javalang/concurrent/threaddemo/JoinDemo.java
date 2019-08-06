package me.ffulauh.javalang.concurrent.threaddemo;

import java.util.Date;

public class JoinDemo {
    public static void main(String[] args) {
        Thread task=new Thread(new task(),"task");
        task.start();
        try {
            task.join();
        }catch (InterruptedException e){
        }
        System.out.println("呵呵呵呵");
    }

    static class task implements Runnable{
        @Override
        public void run() {
            for(;;){
                try{
                    Thread.sleep(1000);
                    System.out.println(new Date());
                } catch (InterruptedException e){

                }
            }
        }
    }
}
