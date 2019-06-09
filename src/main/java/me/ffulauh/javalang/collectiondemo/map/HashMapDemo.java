package me.ffulauh.javalang.collectiondemo.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map map=new HashMap();
        for(int i=0;i<20;i++){
            String iStr=String.valueOf(i);
            map.put(iStr,"v"+i);
        }

        for(int i=0;i<13;i++){
            String iStr=String.valueOf(i);
            map.get(iStr);
        }

    }
}
