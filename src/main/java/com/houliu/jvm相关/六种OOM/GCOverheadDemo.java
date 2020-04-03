package com.houliu.jvm相关.六种OOM;

import java.util.ArrayList;

/**
 * @author houliu
 * @create 2020-04-03 22:27
 *
 *      intern() 方法返回字符串对象的规范化表示形式。
 *      它遵循以下规则：对于任意两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，s.intern() == t.intern() 才为 true。
 *
 *      - GC 回收时间过长会抛出OutOfMemoryError
 *      - 过长的定义是：超过98%的时间用来做GC，并且回收了不到2%的堆内存，连续多次GC都回收了不到2%的极端情况才会抛出
 *      - 如果不抛出 GC overhead limit 错误会发生什么情况呢？那就是GC清理的这么点内存会很快会再次填满，迫使GC再次执行，这样就形成恶性循环，
 *          CPU使用率一直是100%，而GC却没有任何成果
 *
 *      注意： 运行前添加  -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m 参数
 */
public class GCOverheadDemo {

    public static void main(String[] args) {
        int i = 0;
        ArrayList<String> list = new ArrayList<>();
        try {
            while (true){
                list.add(String.valueOf(++i).intern());
            }
        } catch (Exception e) {
            System.out.println("************** i = " + i);
            e.printStackTrace();
            throw e;
        }
    }

}
