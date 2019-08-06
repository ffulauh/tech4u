package me.ffulauh.javalang.concurrent.threaddemo.threadlocal;

public class Task implements Runnable{

    private MeHolder meHolder;

    public MeHolder getMeHolder() {
        return meHolder;
    }

    public void setMeHolder(MeHolder meHolder) {
        this.meHolder = meHolder;
    }

    public Task(MeHolder meHolder){
        this.meHolder=meHolder;
    }

    @Override
    public void run() {
        System.out.println(meHolder.getLocalMe());
    }
}
