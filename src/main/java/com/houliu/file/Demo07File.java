package com.houliu.file;

/**
 * @author houliu
 * @create 2020-01-12 17:13
 */
public class Demo07File {

    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    /**
     * 递归计算1-n的和
     * @param n
     * @return
     */
    private static int sum(int n){
        if (n == 1){
            return 1;
        }
        return sum(n-1) + n;
    }

}
