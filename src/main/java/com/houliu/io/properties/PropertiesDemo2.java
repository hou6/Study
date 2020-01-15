package com.houliu.io.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author houliu
 * @create 2020-01-13 22:59
 */
public class PropertiesDemo2 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            Properties prop = new Properties();
            fr = new FileReader("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/prop.txt");
            prop.load(fr);
            Set<String> set = prop.stringPropertyNames();
            for (String key : set) {
                System.out.println(key + "=" + prop.getProperty(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
