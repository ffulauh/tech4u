package me.ffulauh.javalang;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {
    public static void main(String[] args)throws Exception {
        ClassLoader myLoader=new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName=name.substring(name.lastIndexOf(".")+1)+".class";
                    InputStream is=getClass().getResourceAsStream(fileName);
                    if(is==null){
                        return super.loadClass(name);
                    }
                    byte[] b=new byte[is.available()];
                    is.read(b);
                    return defineClass(name,b,0,b.length);
                } catch (IOException e){
                    throw new ClassNotFoundException(name);
                }

            }
        };
        Object obj=myLoader.loadClass("me.ffulauh.javalang.ClassLoaderTest").newInstance();
        System.out.println(obj.getClass());
        //class me.ffulauh.javalang.ClassLoaderTest
        System.out.println(obj.getClass().getClassLoader());
        //me.ffulauh.javalang.ClassLoaderTest$1@d716361
        System.out.println(me.ffulauh.javalang.ClassLoaderTest.class.getClassLoader());
        //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(obj instanceof me.ffulauh.javalang.ClassLoaderTest);
        //false
        System.out.println(ClassLoader.getSystemClassLoader());
    }
}
