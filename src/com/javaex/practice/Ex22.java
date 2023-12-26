package com.javaex.practice;

public class Ex22 {
	
	public static void main(String[] args) {
		
		System.out.println( 17 < 17 );
		//17보다 17이 큰지 묻고있다. 답은 false
		System.out.println( 17 <= 17 );
		//17보다 17이 작거나 같은지 묻고있다. 답은 true
		System.out.println( 5>= 17 );
		//5가 17보다 크거나 같은지 묻고있다. 답은 false
		System.out.println( 5>= 5 );
		//5가 5보다 크거나 같은지 묻고있다. 답은 true
		System.out.println( 5 == 17 );
		//5와 17이 같은지 묻고있다. 답은 false
		System.out.println( 5 != 17 );
		// 5와 17은 다른지 묻고있다. 답은 true
		System.out.println( !(5==17) );
		// 5와 17이 같은가에 대한 결과값의 반대값을 묻고있다. 앞의 결과값은 false 이므로 반대값은 true 이다.
		
		
		
	}
	
	
}
