package me.ffulauh.javalang.binarytest;

public class BinaryTest {
    public static void main(String[] args) {
//        printBinaryInfo(-7,2,"l");
//        printBinaryInfo(-7,2,"r");
//        hehe(311,16);
        byte a=-5;
        System.out.println(Integer.toBinaryString(a));
        System.out.println((a>>29) +"--"+ Integer.toBinaryString(a>>29));


    }

    public static void printBinaryInfo(int value,int bit,String moveDirection){
//        if(moveDirection.equals("l")){
////            System.out.println(Integer.toBinaryString(value)+"--"+value);
////            System.out.println(Integer.toBinaryString(value<<bit)+"--"+(value<<bit));
////        } else if(moveDirection.equals("r")){
////            System.out.println(Integer.toBinaryString(value)+"--"+value);
////            System.out.println(Integer.toBinaryString(value>>>bit)+"--"+(value>>>bit));
////        } else {
////            throw new IllegalArgumentException("方向错误");
////        }

    }

    public static void hehe(int hashCode,int length){
        System.out.println(Integer.toBinaryString(hashCode));
        System.out.println(Integer.toBinaryString(length-1));
        System.out.println(hashCode%length+"--"+Integer.valueOf(hashCode&(length-1)));
    }


}
