package workbook.stepF;

import java.util.Scanner;

public class CalDate {

	private int monthdays[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	private int month,day;
	private int day_count;
	
	public CalDate() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("월을 입력하시오. ");
		this.month = s.nextInt();
		System.out.print("일을 입력하시오. ");
		this.day = s.nextInt();
		
		
		
	}
	
	int getDate() {
		for(int i=0;i<this.month-1;i++) {
			this.day_count+=monthdays[i];
		}
		return this.day_count+=this.day;
	}
	void printDate() {
		if((this.month>12||this.month<1)||(this.day>monthdays[this.month-1]||this.day<1)) {
			System.out.println("잘못 입력하셨습니다. ");
		}
		else {
			System.out.println("이 날짜는 1년 중 "+getDate()+"번째 날에 해당됩니다. ");
		}
		
	}

}