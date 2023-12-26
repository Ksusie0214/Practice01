package com.javaex.practice;

public class Ex21 {
	
	/*
	 아래의 출력결과를 예상하여 작성하시오. Ex20문제와 어느 부분이 다른지 비교하여 설명하시오.
	 
	 public static void main(String[] agrgs) {
	   
	   	int i = 10;
	    int n = ++i %2;
	    
	    System.out.println(i);
	    System.out.println(n);
	   }
	 
	 20번 문제와 int의 값을 같지만 prefix를 사용하느냐, postfix를 사용하느냐의 차이다.
	 20번문제의 경우 postfix를 사용했고, 21번 문제는 prefix를 사용했다.
	 따라서 n의 값은 11%2 이므로 1이다.
	 i의 값은 n을 계산함에 따라 영구히 올라가므로 11이 된다.
	 
	 
	 */
	
	
	public static void main(String[] agrgs) {
		   
	   	int i = 10;
	    int n = ++i %2;
	    
	    System.out.println(i);
	    System.out.println(n);
	   }
}
