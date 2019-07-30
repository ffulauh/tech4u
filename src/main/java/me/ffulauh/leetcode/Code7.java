package me.ffulauh.leetcode;

public class Code7 {

    public static void main(String[] args) {
        System.out.println(reverse(2390));
    }

    public static int reverse(int x){
        String s=String.valueOf(x);
        if(s.startsWith("-")){
            s="-"+reverseStr(s.substring(1));
        } else {
            s=reverseStr(s);
        }

        try{
            return Integer.valueOf(s);
        } catch (NumberFormatException e){
            return 0;
        }

    }

    public static String reverseStr(String s){
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length/2;i++){
            char temp=chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]=temp;
        }
        return String.valueOf(chars);
    }
}
