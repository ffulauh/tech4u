package me.ffulauh.javalang.iodemo.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class UsingBuffers {
    public static void main(String[] args) {
        char[] data="UsingBuffers".toCharArray();
        ByteBuffer bb=ByteBuffer.allocate(data.length*2);
        CharBuffer cb=bb.asCharBuffer();
        cb.put(data);
        System.out.print(cb.rewind());
        sym(cb);
        System.out.print(cb.rewind());
        sym(cb);
        System.out.print(cb.rewind());

    }
    private static void sym(CharBuffer buffer){
        while (buffer.hasRemaining()){
            buffer.mark();
            char c1=buffer.get();
            char c2=buffer.get();
            buffer.reset();
            buffer.put(c2).put(c1);
        }
    }
}
