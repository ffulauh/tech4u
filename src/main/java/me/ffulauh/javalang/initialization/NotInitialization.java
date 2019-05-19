package me.ffulauh.javalang.initialization;

public class NotInitialization {

    static class Parent{

        static {
            A=2;
        }
        public static int A=1;

    }

    static class Sub extends Parent{
        public static int B=A;
    }


    public static void main(String[] args) {
        System.out.println(Sub.B);

//        System.out.println(SubClass.value);
        //通过子类调用父类的静态字段，不会导致子类初始化
        //输出 superclass init

//        SuperClass[] superClasses=new SuperClass[10];
        //通过数组定义来引用类，不会触发此类的初始化
        //不会输出superclass init, 触发[Lme.ffulauh.javalang.SuperClass的初始化，有字节码指令newarray触发

//        System.out.println(ConstClass.HELLOWORLD);
        //常量在编译阶段会存入调用类的常量池中，本质上没有引用到定义常量的类，因此不会触发定义常量的类的初始化
    }
}

class SuperClass {
    static {
        System.out.println("superclass init");
    }

    static int value=123;
}

class SubClass extends SuperClass{
    static {
        System.out.println("superclass init");
    }
}

class ConstClass{
    static {
        System.out.println("constclass init");
    }
    static final String HELLOWORLD="hello world";
}
