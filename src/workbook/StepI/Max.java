package workbook.StepI;

import java.util.Scanner;

public class Max {
	public int number[]=new int[10];
	public int max_num;
	
	public Max(){
		input();
		
	}
	
	void printMax() {
		System.out.println("최댓값은 "+this.max_num+"입니다. ");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		this.max_num=-1;
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+"번 수를 입력하시오. ");
			this.number[i]=s.nextInt();
			
		}
		this.max_num=MaxOfTen();
		
	}
	
	int MaxOfTen(){
		int max=-1;
		for(int i=0;i<10;i++) {
			if(this.number[i]>max) {
				max=number[i];
			}
		}
		return max;
	}
	
}