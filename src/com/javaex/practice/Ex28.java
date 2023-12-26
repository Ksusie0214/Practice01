package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {
	public static void main (String[] args) {
		
		//원화를 달러화로 계산하는 프로그램을 작성하세요.(환율 1달러 = 1230.95원 상수로 지정)
		//새 스캐너 작성
		Scanner sc = new Scanner(System.in);
		//원화 정보입력 안내문구 출력
		System.out.print("환전할 원화를 입력하세요: ");
		
		//환율 상수지정 및 계산식 작성
		int won = sc.nextInt();
		final double Exchange = 1230.95;
		double dollar = won/Exchange;
		//최종 결과값 출력
		System.out.println("받으실 달러는 " + dollar);
		//스캐너 종료
		sc.close();
		
		
		
	}

}
