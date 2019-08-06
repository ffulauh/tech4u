package me.ffulauh.javalang.concurrent.threaddemo;

public class Interrupted {





    class BusyRunner implements Runnable{
        @Override
        public void run() {
            while (true){}
        }
    }

}
