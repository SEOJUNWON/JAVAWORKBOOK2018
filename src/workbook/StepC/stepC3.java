package workbook.stepC;

import java.util.Scanner;

public class stepC3 {
	private int width;
	private int height;
	private int area;
	
	public stepC3() {
		input();
	}
	
	public void printArea() {
		System.out.println("직사각형의 넓이는 "+getArea()+"이고, ");
		if(this.width==this.height) {
			System.out.println("정사각형입니다.");
		}
		else if(this.width>this.height){
			if(this.width>=2*(this.height)) {
				System.out.println("좌우로 길쭉한 직사각형입니다. ");
			}
			else {
				System.out.println("일반적인 가로형 직사각형입니다. ");
			}
		}
		else {
			if(this.height>=2*(this.width)) {
				System.out.println("위아래로 길쭉한 직사각형입니다. ");
			}
			else {
				System.out.println("일반적인 세로형 직사각형입니다. ");
			}
		}
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하시오. ");
		this.width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하시오. ");
		this.height = s.nextInt();
	}
	
	int getArea() {
		this.area = width*height;
		return this.area;
	}
		
	

}