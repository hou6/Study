package com.houliu.io.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author houliu
 * @create 2020-01-13 22:21
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("张三","123");
        prop.setProperty("李四","456");
        prop.setProperty("猴六","789");
//        prop.put("","");   //尽量不要用put
        Set<String> propertyNames = prop.stringPropertyNames();
        for (String propertyName : propertyNames) {
            System.out.println(prop.getProperty(propertyName));
        }

        FileWriter fw = new FileWriter("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/prop.txt");
        prop.store(fw,"save data");
        fw.close();
    }
}
