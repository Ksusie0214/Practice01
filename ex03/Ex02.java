package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		
		if ( point >= 60 ) {
			//참일 때
			System.out.println("합격입니다.");
		}
		else {
			//그 외 점수가 60미만일 경우
			System.out.println("불합격입니다.");
		}
		sc.close();
	}

}
