package com.p3c.oop;

import java.util.Arrays;

public class SpiltTest {
	
	public static void main(String[] args) {
		// 预期是大于3
//		String testStr = "a, b, c ,,";
//		String[] strArray = testStr.split(",");
//		System.out.println(Arrays.toString(strArray));
		
		String line = "hello,,world,,,";
        String res1[] = line.split(",");
        String res2[] = line.split(",", 2);
        int i=1;
        for(String r: res1) {
        	System.out.println(i+++r);
        }
        
        System.out.println("========================");
        i=1;
        for(String r: res2) {
        	System.out.println(i+++r);
        }
            
	}
}
