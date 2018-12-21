package workbook.stepC;

import java.util.Scanner;

public class stepC11 {
	private int year;
	private int result;
	
	public stepC11() {
		input();
	}
	
	public void printResult() {
		if(getResult()==1) {
			System.out.println("입력하신 년도는 윤년입니다. ");
		}
		else if(getResult()==-1) {
			System.out.println("입력하신 년도는 윤년이 아닙니다. ");
		}
	
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("년도를 입력하세요. ");
		this.year = s.nextInt();
	}
	
	int getResult() {
		if((this.year%4)==0) {
			if((this.year%100)==0) {
				if(this.year%400==0) {
					this.result=1;
				}
				else {
					this.result=-1;
				}
			}
			else {
				this.result=1;
			}
			
		}
		else {
			this.result=-1;
		}
		return this.result;
	}
	
	



}