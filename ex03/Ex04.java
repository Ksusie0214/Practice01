package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간을 입력해주세요: ");
		int time =  sc.nextInt();
		int extra = time-8;
		
		if(time <= 8) {
			int less = time*10000;
				System.out.println("임금은 " + less + " 원 입니다.");
		}
		else {
			int more = (80000 +(extra*12000));
				System.out.println("임금은 " + more + " 원 입니다.");
		}
		
		sc.close();
		
		
	}

}
