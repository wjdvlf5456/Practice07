package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		// Shape s = new Shape("빨강");
		
		// Shape는 추상클래스라서 직접 객체를 생성할 수 없다.
		
		
		Circle c1 = new Circle("녹색", 10);
		Rectangle r1 = new Rectangle("빨강", 12, 10);
		Shape sr1 = new Rectangle("빨강", 4, 4);

		// sr1을 그리는 메소드 호출
		Shape[] dArray = new Shape[3];

		dArray[0] = c1;
		dArray[1] = r1;
		dArray[2] = sr1;

		for (int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}

		// sr1의 가로크기 출력
		sr1.draw();
		

	}
}
