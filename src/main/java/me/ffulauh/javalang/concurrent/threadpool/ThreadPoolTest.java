package me.ffulauh.javalang.concurrent.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(new MyTask("任务1:", 10));
        service.execute(new MyTask("任务2:", 20));
        service.execute(new MyTask("任务3:", 30));
        service.shutdown();
    }
}

class MyTask implements Runnable {

    String taskName;
    int execTime;

    public MyTask(String taskName, int execTime) {
        this.execTime = execTime;
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < execTime; i++) {
                System.out.println(taskName + "执行了：" +i+"秒"+Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
