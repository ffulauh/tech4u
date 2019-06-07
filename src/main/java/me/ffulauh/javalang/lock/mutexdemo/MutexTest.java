package me.ffulauh.javalang.lock.mutexdemo;

public class MutexTest {
    Mutex lock;

    public MutexTest(){
        this.lock=new Mutex();
    }

    public void print(){
        lock.lock();
        try{
            System.out.println("aaaaaaaaaaaa");
            lock.lock();
            lock.isLocked();
        }finally {
            lock.unlock();
        }

        lock.lock();
        try{
            System.out.println("bbbbbbbbb");
        }finally {
            lock.unlock();
        }


    }


    private static class MutexTask implements Runnable{
        MutexTest mutexTest;

        MutexTask(MutexTest mutexTest){
            this.mutexTest=mutexTest;
        }

        @Override
        public void run() {
            mutexTest.print();
        }
    }

    public static void main(String[] args) {
        MutexTest mutexTest=new MutexTest();
        Thread a=new Thread(new MutexTask(mutexTest),"aaaa");
        Thread b=new Thread(new MutexTask(mutexTest),"bbbb");
        Thread c=new Thread(new MutexTask(mutexTest),"cccc");
        Thread d=new Thread(new MutexTask(mutexTest),"dddd");

        a.start();
        b.start();
        c.start();
        d.start();
        System.out.println("hehe");
    }
}
