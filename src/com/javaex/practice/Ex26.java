package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {
	
	public static void main (String[] args) {
		
		
		//스캐너 새로 등록
		Scanner sc = new Scanner(System.in);
		//월급값 입력안내 출력
		System.out.print("월급을 입력하세요: ");
		long money = sc.nextLong();
		//10년간의 최대 저축액 계산
		long save = money*12l;
		//저축액 계산값 출력
		System.out.println("10년동안 최대 저축액은 " + save + " 원 입니다.");
		//스캐너 종료
		sc.close();
		
		
	}

}
