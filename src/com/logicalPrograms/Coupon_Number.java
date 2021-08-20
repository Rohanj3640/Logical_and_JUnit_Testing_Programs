package com.logicalPrograms;

public class Coupon_Number {
    public static void main(String[] args) {

        //char array to get characters for coupon
        char[] chars = "djfgghghdfsfcbvv19844vkh5".toCharArray();

        //length of coupon
        int max = 100000000;

        //random value
        int random = (int)(Math.random()*max);
        StringBuffer sc = new StringBuffer();

        while (random > 0) {
            sc.append(chars[random % chars.length]);
            random /= chars.length;

        }

        String couponCode = sc.toString();
        System.out.println("Coupon Code: " + couponCode);
    }
}
