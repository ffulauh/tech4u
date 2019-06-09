package me.ffulauh.javalang.collectiondemo.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        Map map = new ConcurrentHashMap();
        for(int i=0;i<20;i++){
            String iStr=String.valueOf(i);
            map.put(iStr,"v"+i);
            map.get(i+"");
        }
    }
}
