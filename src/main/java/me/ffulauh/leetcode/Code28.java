package me.ffulauh.leetcode;

public class Code28 {
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }

    public static int strStr(String haystack, String needle) {
        if(needle==null){
            return 0;
        }
        for(int i=0;i<haystack.length();i++){
            if(haystack.substring(i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
