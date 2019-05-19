package me.ffulauh.javalang.innerclass;

public class OutClass {

    private int outerFiled;
    private static int outerStaticFiled;

    public OutClass(){
    }

    class InnerClass {
        void innerM(){
            System.out.println(outerFiled);
            System.out.println(OutClass.outerStaticFiled);
            System.out.println(OutClass.this.outerFiled);
        }
    }

    static class StaticInnerClass {
        void innerSM(){

            //Non-static field 'outerFiled' cannot be referenced from a static context
//            System.out.println(outerFiled);
//            System.out.println(OutClass.this.outerFiled);
            System.out.println(outerStaticFiled);
        }
    }
}
