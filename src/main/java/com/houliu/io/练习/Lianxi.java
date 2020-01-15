package com.houliu.io.练习;

/**
 * @author houliu
 * @create 2020-01-14 14:32
 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 *    对文本进行排序  1,2,3,4,5......
 */
public class Lianxi {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/out.txt"));
        String line;
        while ((line = br.readLine()) != null){
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }

        for (String key : map.keySet()) {
            String value = map.get(key);
            line = key + "." + value;
            bw.write(line);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
