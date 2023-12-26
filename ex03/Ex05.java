package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간을 입력해주세요: ");
		int time = sc.nextInt();
		int money = time*10000;
		int extra = time-8;
		
		if(time <= 8) {
				System.out.println("임금은 " + money + " 원 입니다.");
		}
		else {
			double more = 80000+(extra*15000);
				System.out.println("임금은 " + more + " 원 입니다.");
		}
		
		sc.close();
		
		
	}

}
