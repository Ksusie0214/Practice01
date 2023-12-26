package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {
	
	public static void main (String[] args) {
		
		
		//새로운 스캐너 등록
		Scanner sc = new Scanner(System.in);
		
		//가로값 입력안내 출력
		System.out.print("가로를 입력하세요: ");
		int width = sc.nextInt();
		//세로값 입력안내 출력
		System.out.print("세로를 입력하세요: ");
		int length = sc.nextInt();
		
		//사각형의 넓이 계산
		int area = width*length;
		//사각형의 둘레 계산
		int round = (width+length)*2;
		
		//사각형의 넓이값 출력
		System.out.println("사각형의 넓이는 " + area);
		//사각형의 둘레값 출력
		System.out.println("사각형의 둘레는 " + round);
		
		//스캐너 종료
		sc.close();
		
		
		
		
	}

}
