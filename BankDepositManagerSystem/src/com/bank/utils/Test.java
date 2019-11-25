package com.bank.utils;

/**
 * @Autor:qianzf
 * @Date:2019/7/22 11:28
 */
public class Test {
    public static void main(String[] args) {
        String pwd="123456";
        MD5 md5 = new MD5();
        System.out.println(md5.getMD5ofStr(pwd));
    }
}
