package me.fullauh.javalang;

/**
 * Created by ffulauh on 2017/4/25.
 */
public class ExceptionUtils {
    public static void main(String[] args) {
        try{
            String han="2,2,2";
            String[] hans=han.split(",");
            String haha=hans[5];
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
