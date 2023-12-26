package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {
	
	public static void main (String[] args) {
		
		//스캐너 새로 등록
		Scanner sc = new Scanner(System.in);
		
		//가로값 안내출력
		System.out.println("가로: ");
		int width = sc.nextInt();
		
		//세로값 안내출력
		System.out.println("세로: ");
		int length = sc.nextInt();
		
		//삼각형의 넓이 계산식
		int result = (width+length)*2;
		
		//최종 넓이값 출력
		System.out.println("삼각형의 넓이는 " + result + "입니다.");
		
		//스캐너 종료
		sc.close();
		
		
	}

}
