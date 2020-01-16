package com.houliu.io.inet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author houliu
 * @create 2020-01-16 17:22
 */
public class URLDemo {
    public static void main(String[] args) {
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        FileOutputStream fos = null;
        try {
            URL url = new URL("http://localhost:8080/examples/beauty.jpg");
            urlConnection = (HttpURLConnection) url.openConnection();  //获取连接
            urlConnection.connect();  //连接
            //获取输入流去读服务器的数据
            inputStream = urlConnection.getInputStream();
            fos = new FileOutputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/inet/face3.jpg");
            int len = 0;
            byte[] buffer = new byte[1024];
            while ((len = inputStream.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
            System.out.println("下载完成。。。。。。");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (urlConnection != null){
                urlConnection.disconnect();  //断开连接
            }
        }
    }
}
