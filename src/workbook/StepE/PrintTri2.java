package workbook.stepE;

import java.util.Scanner;

public class PrintTri2 {
	private int height;
	private int i,j;
	
	public PrintTri2(){
		input();
		
	}
	
	void printTri() {
		getTri();
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("이등변 삼각형의 높이를 입력하시오. ");
		this.height=s.nextInt();
		
		
	}
	
	
	void getTri() {
		for(i=0;i<this.height;i++) {
			
			
			for(j=i;j<this.height-1;j++) {
				System.out.print(" ");
			}
			for(j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}