package workbook.StepD;

import java.util.Scanner;

public class calFunc2 {
	private int a, b, c;
	private int x_begin, x_end; 
	private int x,y;
	private int i;
	
	public calFunc2(){
		input();
	}
	
	void printXY() {
		System.out.println("좌표 ("+this.i+", "+getY()+")");
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("2차 함수 y=ax^2+bx+c의 계수 a와 b,c를 입력하시오. ");
		this.a=s.nextInt();
		this.b=s.nextInt();
		this.c=s.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오. ");
		this.x_begin=s.nextInt();
		this.x_end=s.nextInt();
		
		for(i=1;i<=x_end;i++) {
			getXY();
		}
		
		
	}
	
	
	void getXY() {
		printXY();
	}
	int getY() {
		this.y=(this.a*this.i*this.i)+this.b*this.i+this.c;
		return this.y;
	}
	
}
