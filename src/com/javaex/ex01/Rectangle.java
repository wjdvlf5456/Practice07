package com.javaex.ex01;

public class Rectangle extends Shape {

	private int width;
	private int height;

	//생성자
	public Rectangle(String fillColor, int width, int height) {
		super(fillColor);
		this.width = width;
		this.height = height;
	}
	
	
	//게터세터
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// Shaped의 draw를 사용해줬다.
	public void draw() {
		System.out.println("[사각형]#면색: " + super.fillColor + " " + " #가로:" + width + " #세로:" + height + "그렸습니다.");
	}

}
