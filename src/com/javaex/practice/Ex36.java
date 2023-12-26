package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//동전 정보안내 출력 및 동전의 갯수 입력
		System.out.println("500원 개수 : ");
		//동전에 따른 값 계산
		int coin1 = sc.nextInt();
		
		//동전 정보안내 출력 및 동전의 갯수 입력
		System.out.println("100원 개수 : ");
		//동전에 따른 값 계산
		int coin2 = sc.nextInt();
		
		//동전 정보안내 출력 및 동전의 갯수 입력
		System.out.println("50원 개수 : ");
		//동전에 따른 값 계산
		int coin3 = sc.nextInt();
		
		//동전 정보안내 출력 및 동전의 갯수 입력
		System.out.println("10원 개수 : ");
		//동전에 따른 값 계산
		int coin4 = sc.nextInt();
		
		//최종 동전의 값 계산
		int result1 = 500*coin1;
		int result2 = 100*coin2;
		int result3 = 50*coin3;
		int result4 = 10*coin4;
		int finalresult = result1+result2+result3+result4;
		
		//동전의 가격별로 변수를 나누어 각자 곱셈으로 계산한 후, 최종결과 변수를 따로 만들어 앞 결과들을 더했다.
		//더 좋은 코드가 있을 것 같다...
				
		
		//동전의 최종 가격 출력
		System.out.println("동전의 총합은 " + finalresult + " 원 입니다.");
		
		//스캐너 종료
		sc.close();
		
		
	}

}
