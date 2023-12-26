package com.javaex.practice;

public class Ex19 {
	
	public static void main (String[] args) {
		
		int num01 = 40; 
		int num02 = 50;
		int result = (num01++) + (++num02);
		
		System.out.println(result);
		//postfix는 계산 이후에 적용되고, prefix는 계산전 먼저 적용되므로 식은 40+51이 된다. 따라서 result는 91이다.
		System.out.println(num01);
		//result 계산 이후 적용된 postfix값을 더하여 값은 41이다.
		System.out.println(num02);
		//result 계산에 이용된 prefix값이 그대로 적용되므로 값은 51이다.
		
		
		
	}

}
