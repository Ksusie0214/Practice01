package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//연필갯수 안내출력 및 정보입력
		System.out.print("전체 연필갯수를 입력해주세요: ");
		int num = sc.nextInt();
		
		//인원수 안내출력 및 정보입력
		System.out.print("전체 인원수를 입력해주세요: ");
		int person = sc.nextInt();
		
		//수식 입력
		int result = num/person;
		//위의 코드는 연필 갯수를 현재 인원수로 나눈 결과값을 출력한다.
		
		//나머지 계산 수식 입력
		int result2 = num%person;
		//위의 코드는 연필 갯수를 현재 인원수로 나눈 것의 나머지 결과값을 출력한다.
		
		//계산된 정도 출력
		System.out.println("1인당 연필의 갯수는 " + result + " 입니다.");
		System.out.println("연필의 나머지 갯수는 " + result2 + "입니다.");
		//각각의 코드는 첫번째 결과값(result) 와 두번째 결과값(result2)를 출력한다.
		
		
		
		//스캐너 종료
		sc.close();
		
		
		
		
	}

}
