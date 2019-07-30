package me.ffulauh.javalang.threaddemo.threadlocal;

public class MeHolder {
    private static final ThreadLocal<Me> localMe=new ThreadLocal<>();
    private Me me;

    public MeHolder(Me me){
        this.me=me;
    }

    Me getLocalMe() {
        Me me=localMe.get();
        if(me==null){
            localMe.set(getMe());
        }
        return me;
    }

    void setLocalMe(Me me){
        localMe.set(me);
    }

    public Me getMe() {
        return me;
    }

    public void setMe(Me me) {
        this.me = me;
    }
}
