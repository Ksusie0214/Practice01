package com.javaex.practice;

public class Ex20 {
	/* 아래의 출력결과를 예상하여 작성하시오.
	   public static void main(String[] agrgs) {
	   
	   	int i = 10;
	    int n = i++ %2;
	    
	    System.out.println(i);
	    System.out.println(n);
	   }
	 */
		//i의 값은 10이다. 하지만 n의 값은 i를 2로 나누어 남는 나머지값을 원한다.
		//따라서 n의 값은 0이다. 하지만 i의 값은 n을 계산하는 과정을 거처 1이 된다.
		//따라서 n의 값은 0이지만, 최종 i의 값은 11이 된다. 
	
	public static void main(String[] agrgs) {
		   
	   	int i = 10;
	    int n = i++ %2;
	    
	    System.out.println(i);
	    System.out.println(n);
	}
	
	
}
