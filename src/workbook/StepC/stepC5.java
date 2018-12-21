package workbook.stepC;

import java.util.Scanner;

public class stepC5 {
	private int month;
	private int days;
	private int day_count;
	
	public stepC5() {
		input();
	}
	
	public void printDay() {
		if(getDay()==-1) {
			System.out.println("잘못 입력하셨습니다. ");
		}
		else {
			System.out.println("이 날짜는 1년 중 "+getDay()+" 번째 날에 해당됩니다.");
		}
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("월을 입력하세요. ");
		this.month=s.nextInt();
		System.out.print("일을 입력하세요. ");
		this.days=s.nextInt();
	}
	
	int getDay() {
		if(this.month==12) {
			this.day_count=6*31+4*30+28+this.days;
		}
		else if(this.month==11) {
			this.day_count=6*31+3*30+28+this.days;
		}
		else if(this.month==10) {
			this.day_count=5*31+3*30+28+this.days;
		}
		else if(this.month==9) {
			this.day_count=5*31+2*30+28+this.days;
		}
		else if(this.month==8) {
			this.day_count=4*31+2*30+28+this.days;
		}
		else if(this.month==7) {
			this.day_count=3*31+2*30+28+this.days;
		}
		else if(this.month==6) {
			this.day_count=3*31+1*30+28+this.days;
		}
		else if(this.month==5) {
			this.day_count=2*31+1*30+28+this.days;
		}
		else if(this.month==4) {
			this.day_count=2*31+0*30+28+this.days;
		}
		else if(this.month==3) {
			this.day_count=1*31+0*30+28+this.days;
		}
		else if(this.month==2) {
			this.day_count=1*31+0*30+this.days;
		}
		else if(this.month==1) {
			this.day_count=this.days;
		}
		else {
			this.day_count=-1;
		}
		return this.day_count;
	}
		
		
		
	

}