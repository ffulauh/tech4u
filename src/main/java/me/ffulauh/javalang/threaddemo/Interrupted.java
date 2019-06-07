package me.ffulauh.javalang.threaddemo;

public class Interrupted {





    class BusyRunner implements Runnable{
        @Override
        public void run() {
            while (true){}
        }
    }

}
