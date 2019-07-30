package me.ffulauh.javalang.iodemo.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderAndWrite {
    public static void main(String[] args) throws Exception{
        FileWriter fileWriter=new FileWriter(new File("bytes"));
        fileWriter.write("不会覆盖文件原本的内容");
        fileWriter.write("不会覆盖文件原本的内容\n");
//        fileWriter.write(null); //不能直接写入 null
        fileWriter.append("并不是追加一行内容，不要被方法名迷惑");
        fileWriter.append("并不是追加一行内容，不要被方法名迷惑\n");
        fileWriter.append(null);
        fileWriter.flush();
        fileWriter.close();
        System.out.println("文件的默认编码为" + fileWriter.getEncoding());
    }
}
