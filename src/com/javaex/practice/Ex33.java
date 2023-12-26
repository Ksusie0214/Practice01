package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {
	
	public static void main (String[] args) {
	
	//사용자로부터 구의 반지름을 입력받아 구의 부피를 계산하는 프로그램을 작성하세요.
	
	//새 스캐너 작성
	Scanner sc = new Scanner(System.in);
	//반지름을 입력하는 안내문구 출력 및 정보 입력
	System.out.print("반지름: ");
	int radius = sc.nextInt();
	//구의 부피를 구하는 계산식 입력
	double volume = 4/3*3.14*radius*radius*radius;
	//최종 부피를 출력하는 안내문구 출력
	System.out.println("구의 부피는: "+ volume + " 입니다.");
	//스캐너 종료
	sc.close();
	}
}
