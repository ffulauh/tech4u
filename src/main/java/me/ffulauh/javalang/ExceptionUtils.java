package me.ffulauh.javalang;

/**
 * Created by ffulauh on 2017/4/25.
 */
public class ExceptionUtils {
    public static void main(String[] args){
        try{
            hehe();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String hehe() throws Exception {
        throw new Exception();
    }
}

