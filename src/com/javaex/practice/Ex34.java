package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {
	
	public static void main (String[] args) {
		
		//Ex18 사용자로부터 화씨 온도를 입력받아 섭씨 온도로 변환하는 프로그램을 작성하세요.
		
		//새 스캐너 작성
		Scanner sc = new Scanner(System.in);
		//화씨 정보입력 안내문구 출력 및 정보 입력
		System.out.print("화씨: ");
		double Fahrenheit = sc.nextDouble();
		//화씨를 섭씨로 바꾸는 계산식을 입력
		double Celcius = 5/9*(Fahrenheit - 32);
		//최종 정보값 출력
		System.out.println("화씨 " + Fahrenheit + " 의 섭씨온도는 " + Celcius + "입니다.");
		//스캐너 종료
		sc.close();
		
		
		
		
	}

}
