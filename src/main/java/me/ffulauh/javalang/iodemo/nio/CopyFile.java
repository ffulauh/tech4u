package me.ffulauh.javalang.iodemo.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CopyFile {
    private static final String sourceFilePath="./src/main/java/me/ffulauh/javalang/iodemo/nio/data.txt";
    private static final String destFilePath="./src/main/java/me/ffulauh/javalang/iodemo/nio/destData.txt";
    private static final int BSIZE=1024;

    public static void main(String[] args)throws Exception {
        FileChannel in=new FileInputStream(sourceFilePath).getChannel(),
                out = new FileOutputStream(destFilePath).getChannel();
//        ByteBuffer buffer=ByteBuffer.allocate(1024);
//        while (in.read(buffer)!=-1){
//            buffer.flip();
//            out.write(buffer);
//            buffer.clear();
//        }

//        in.transferTo(0,in.size(),out);
        out.transferFrom(in,0,in.size());
    }
}
