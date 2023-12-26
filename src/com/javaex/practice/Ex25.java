package com.javaex.practice;

public class Ex25 {
	
	public static void main(String[] args) {
		
		int a = 13;
		
		System.out.println( (a>13) && (a>=13));
		//a가 13보다 큰지에 대한 결과값 && a가 13보다 크거나 같은지에 대한 결과값
		//false && true = false
		
		System.out.println( (a>13) || (a>=13));
		//a가 13보다 큰지에 대한 결과값 || a가 13보다 크거나 같은지에 대한 결과값
		//false || true = true
		
		System.out.println((a/3 == 4 ) && (a%3 == 2) );
		//a나누기3은 4이다의 결과값 && a 나누기 3의 나머지값이 2이다의 결과값
		// true && false = false
		
		System.out.println((a/3 == 4 ) || (a%3 == 2) ) ;
		//a나누기 3은 4이다의 결과값 || a나누기 3의 나머지값이 2이다의 결과값
		//true || false = true
		
		System.out.println((a/3 == 4) && (a%3 == 2) || (a/3 ==4));
		//a나누기 3은 4이다의 결과값 && a나누기 3의 나머지값은 2이다의 결과값 || a나누기 3은 4이다의 결과값
		//true&&false||true
		//false||true = true
		
		
	}

}
