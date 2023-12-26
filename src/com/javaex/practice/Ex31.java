package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {
	
	public static void main (String[] args) {
		
		
		//스캐너 새로 등록
		Scanner sc = new Scanner(System.in);
		//상품가격 입력안내출력
		System.out.print("상품가격: ");
		double price = sc.nextDouble();
		//받은돈 입력안내출력
		System.out.print("받은돈: ");
		double money = sc.nextDouble();
		
		System.out.println("=====================================");
		
		//받은돈 액수 출력
		System.out.println("받은돈: " + price);
		//상품가격 액수 출력
		System.out.println("상품가격: "+ money);
		//부가세 액수 계산
		double vat = price*0.1;
	
		//부가세 액수 출력
		System.out.println("부가세: " + vat);
		//잔액 계산
		double finalprice = money-price;
		//잔액 액수 출력
		System.out.println("잔액: " + finalprice);
		
		
		//스캐너 종료
		sc.close();
		
		
		
	}

}
