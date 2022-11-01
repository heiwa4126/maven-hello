package com.sample;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Hello world! with sha256
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String msg = "Hello World!";
        System.out.println(msg);
        System.out.println(DigestUtils.sha256Hex(msg));
    }
}
