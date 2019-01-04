package workbook.StepI;

import java.util.Scanner;

public class Triangle {
	private int height,blank;
	private int i,j;
	public String ch;
	
	public Triangle(){
		input();
		
	}
	
	void printTri() {
		for(int i=0;i<this.height;i++) {
			PrintCharWithBlank(this.blank,(i+1),this.ch);
		}
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("직각삼각형을 그리는데 사용할 문자를 입력하시오. ");
		this.ch=s.next();
		System.out.print("직각삼각형의 높이와 왼쪽 여백의 크기를 입력하시오. ");
		this.height=s.nextInt();
		this.blank=s.nextInt();
		
		
	}
	
	
	void PrintCharWithBlank(int blanks, int size, String ch) {
			for(j=0;j<blank;j++) {
				System.out.print(" ");
			}
			for(j=0;j<this.height-size;j++) {
				System.out.print(" ");
			}
			for(j=0;j<size;j++) {
				System.out.print(ch);
			}
			System.out.print("\n");
	}
}