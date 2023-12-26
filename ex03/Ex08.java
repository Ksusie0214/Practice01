package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요: ");
		double num = sc.nextDouble();
		
		if(num > 0) {
			if(num%2 == 0) {
				System.out.println("양수");
			}
			else {
				System.out.println("홀수");
			}
			
		}
		else if( num < 0 ) {
			System.out.println("음수");
		}
		else {
			System.out.println("0");
		}
		
		sc.close();
	}

}
