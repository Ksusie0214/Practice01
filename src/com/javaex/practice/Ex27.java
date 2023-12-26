package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {
	
	public static void main (String[] args) {
		//반지름을 입력받아 원의 면적을 구하는 프로그램을 작성하세요. (파이값은 3.14로 상수로 지정)
		
		//새 스캐너 작성
		Scanner sc = new Scanner(System.in);
		//반지름 정보입력 안내문구 출력
		System.out.print("반지름을 입력하세요: ");
		//원주율 상수 지정 및 원의 면적을 구하는 계산식 작성
		double radius = sc.nextDouble();
		final double PI = 3.14;
		double width = radius*radius*PI;
		//최종 결과값 출력
		System.out.println("원의 넓이는 " + width);
		//스캐너 종료
		sc.close();
		
		
		
		
		
	}

}
