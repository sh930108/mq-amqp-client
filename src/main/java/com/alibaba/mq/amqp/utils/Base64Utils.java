package com.alibaba.mq.amqp.utils;

import java.io.IOException;
import java.util.Base64;

import static com.alibaba.mq.amqp.constants.Constants.UTF8;


public class Base64Utils {

    /**
     * Decode for Base64 string
     *
     *
     * @param str  String need to be decoded
     * @return String decode from the input string
     */
    public static String decode(String str) {
        return new String(Base64.getDecoder().decode(str.getBytes(UTF8)), UTF8);
    }

    public static String decodeV2(String str) {
        try {
            return new String(net.iharder.Base64.decode(str), UTF8);
        } catch (IOException e) {
            throw new IllegalArgumentException("Decoding input string exception", e);
        }
    }

    /**
     * Encode a string into Base64 String
     *
     * @param str  String need to be encoded
     * @return     An Base64 string
     */
    public static String encode(String str) {
        return new String(Base64.getEncoder().encode(str.getBytes(UTF8)), UTF8);
    }

    public static String encodeV2(String str) {
        return net.iharder.Base64.encodeBytes(str.getBytes(UTF8));
    }
}
