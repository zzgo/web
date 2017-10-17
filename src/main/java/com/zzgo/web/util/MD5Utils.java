package com.zzgo.web.util;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {
    public static String getMD5(String info) {
        //确定计算方法
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            //加密后的字符串
            info = base64en.encode(md5.digest(info.getBytes("utf-8")));
            return info;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return "";
    }

    public static void main(String[] args) {
        String str = getMD5("abcd123");
        System.out.println(str);
    }
}
