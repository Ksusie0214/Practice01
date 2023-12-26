package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {
	
	public static void main (String[] args) {
		
		//마일을 Km로 변환하는 프로그램을 작성하시오.
		//새 스캐너 작성
		Scanner sc = new Scanner(System.in);
		//마일 정보입력 안내문구 출력
		System.out.print("마일을 입력하세요: ");
		
		//마일 상수지정 및 계산식 작성
		final int mile = sc.nextInt();
		double kilometer = mile*1.609;
		//최종결과 출력
		System.out.println(mile + " 마일은 " + kilometer + " 킬로미터 입니다.");
		//스캐너 종료
		sc.close();
		
		
	}

}
