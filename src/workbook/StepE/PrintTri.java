package workbook.stepE;

import java.util.Scanner;

public class PrintTri {
	private int height,blank;
	private int i,j;
	
	public PrintTri(){
		input();
		
	}
	
	void printTri() {
		getTri();
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("직각삼각형의 높이와 왼쪽 여백의 크기를 입력하시오.");
		this.height=s.nextInt();
		this.blank=s.nextInt();
		
		
	}
	
	
	void getTri() {
		for(i=0;i<this.height;i++) {
			
			for(j=0;j<this.blank;j++) {
				System.out.print(" ");
			}
			for(j=i;j<this.height-1;j++) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
