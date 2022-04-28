package com.javaex.ex02;

public class Duck extends Bird {

	// 필드
	private String name = "오리";

	// 생성자
	public Duck() {
		
	}

	// 메소드 - gs

	// 메소드 - 일반
	public void sing() {
		System.out.println(name + "("+ super.getName() +")가 소리내어 웁니다.");

	}

	public void fly() {
		System.out.println(name + "("+ super.getName() +")가 날지 않습니다.");

	}

	public void showName() {
		System.out.println(name + "의 이름은 " + super.getName() + "입니다.");

	}

}