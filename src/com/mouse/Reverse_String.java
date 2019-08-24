package com.mouse;

/**
 * @author 咖啡不加糖
 * @Date: 2019/8/25 1:28
 */

import java.util.Arrays;

/**
 * 字符串反转
 */
public class Reverse_String {
    public static void main(String[] args) {

    }

    static void reverse_string(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }
}
