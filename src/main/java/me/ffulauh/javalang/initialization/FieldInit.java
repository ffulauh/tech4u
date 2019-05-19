package me.ffulauh.javalang.initialization;

public class FieldInit {
    public static void main(String[] args) {
        Sub sub=new Sub();
        System.out.println("hehe");
    }
}

class Super {

    static {
        System.out.println("父类静态块");
    }

    static int staticIntF;
    int intF;
    String stringF;
    static String staticStringF;



    {
        System.out.println("父类构造块");
    }

    public Super(){
        System.out.println("父类构造方法");
    }

}

class Sub extends Super{
    static int subStaticIntF;
    int subIntF;
    String subStringF;
    static String subStaticStringF;

    static {
        System.out.println("子类静态库");
    }
    {
        System.out.println("子类构造块");
    }

    public Sub(){
        System.out.println("子类构造方法");
    }
    int subIntF2;


}
