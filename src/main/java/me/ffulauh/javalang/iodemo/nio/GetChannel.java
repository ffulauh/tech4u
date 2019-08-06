package me.ffulauh.javalang.iodemo.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel{
    private static final String filePath="./src/main/java/me/ffulauh/javalang/iodemo/nio/data.txt";
    private static final int BSIZE=1024;
    public static void main(String[] args)throws Exception {
        FileChannel fc=new FileOutputStream(filePath).getChannel();
        fc.write(ByteBuffer.wrap("some text".getBytes()));
        fc.close();
        fc=new RandomAccessFile(filePath,"rw").getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("more text".getBytes()));
        fc.close();

        fc=new FileInputStream(filePath).getChannel();
        ByteBuffer buffer=ByteBuffer.allocate(BSIZE);
        fc.read(buffer);
        buffer.flip();
//
        while (buffer.hasRemaining()){
            System.out.print((char) buffer.get());
        }
        //会出现乱码，打印的时候解码，或者输入时解码
//        System.out.println(buffer.asCharBuffer());





    }
}
