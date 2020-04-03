package com.houliu.jvm相关.六种OOM;

import java.nio.ByteBuffer;

/**
 * @author houliu
 * @create 2020-04-03 22:41
 *
 * - 导致原因：写NIO程序经常使用ByteBuffer来读取或写入数据，这是一种基于通道(Channel)和缓冲区(Buffer)的IO方式，
 *      它可以使用Native函数库直接分配堆外内存，然后通过一个存储在Java堆里面的DirectByteBuffer对象作为这块内存的引用进行操作，
 *      这样能在一些场景中提高性能，避免了在Java堆和Native堆中来回复制数据
 *
 * - ByteByteBuffer.allocate(Capability): 这方式是分配JVM堆内存，属于GC管辖范围，由于需要拷贝，所以速度相对较慢
 * - ByteByteBuffer.allocateDirect(Capability):  这种方式是分配OS本地内存，不属于GC管辖范围，不需要内存拷贝，所以速度相对较快
 *
 * - 但如果不断分配本地内存，堆内存很少使用，那么JVM就不需要执行GC，DirectByteBuffer对象就不会进行回收，这时候堆内存充足，
 *      但是本地内存可能已经使用光了，再次尝试分配本地内存就会出现OutOfMemoryError，那程序就直接崩溃了
 *
 *   注意： 运行前添加  -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m 参数
 */
public class DirectBufferMemoryDemo {

    public static void main(String[] args) {
        System.out.println("配置的最大maxDirectMemory:" + (sun.misc.VM.maxDirectMemory() / (double)1024 / 1024) + "MB");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // -XX:MaxDirectMemorySize=5m, 这里配置为5m，但实际使用6m，故意使坏
        ByteBuffer bb = ByteBuffer.allocateDirect(6 * 1024 * 1024);
    }

}
