package com.javaex.practice;

public class Ex13 {
	
	public static void main(String[] args) {
		
		System.out.println(13/5);					//둘다 정수형이므로 소수점 아래는 버리기 때문에 혼자 값이 다르다.
		System.out.println((double)13/5);			//앞에 double이 붙어있어 뒤가 정수형이더라도 실수형변환된다.
		System.out.println(13/(double)5);			//뒤에 double이 붙어있어 앞이 정수형이더라도 실수형변환된다
		System.out.println((double)13/(double)5);	//둘다 double이므로 값은 실수가 된다.
		System.out.println(13/0.5);					//앞이 실수로 입력되어 있으므로 결과는 실수형변환된다.
		System.out.println(13/5.0);					//뒤가 실수로 입력되어 있으므로 결과는 실수형변환된다.
		System.out.println((double)(13/5));			//정수형으로 나누더라도 결과값 앞에 double이 붙어있으므로 실수형변환된다.
		
		
	}

}
