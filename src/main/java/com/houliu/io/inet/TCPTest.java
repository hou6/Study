package com.houliu.io.inet;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author houliu
 * @create 2020-01-16 16:02
 */
public class TCPTest {

    /**
     *       这里要用try，不要直接抛
     * @throws IOException
     */

    @Test
    public void client() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 6666);
        //获取socket的输出流
        OutputStream outputStream = socket.getOutputStream();
        //获取一个输入流，从文件里去读数据
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/inet/face.jpg")));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
        }
        bis.close();
        outputStream.close();
        socket.close();
    }

    @Test
    public void server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket accept = serverSocket.accept();
        //获取serverSocket的输入流
        InputStream inputStream = accept.getInputStream();
        //获取一个输出流，写入到文件中
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/inet/face2.jpg")));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bos.close();
        inputStream.close();
        serverSocket.close();
    }

}
