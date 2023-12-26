package com.javaex.practice;

public class Ex16 {
	
	public static void main(String[] agrgs) {
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		// a는 x+1 값의 2를 곱한 값이므로 2*2 = 4이다. 이후 x의 값은 1 증가한다.
		int b = y++ *2;
		// b는 y값 *2의 값이고, y의 값은 계산식 이후 1 증가하므로 1*2 = 2이다.
		
		System.out.println("a=" +a);
		// 4
		System.out.println("b=" +b);
		// 2
		System.out.println("x=" +x);
		// 2
		System.out.println("y=" +y);
		// 2
	}

}
