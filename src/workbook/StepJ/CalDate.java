package workbook.StepJ;

import java.util.Scanner;

public class CalDate {
	public int monthdays[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	int month1,month2;
	int day1,day2;
	int Date1,Date2;
	
	public CalDate() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 날짜를 입력하시오. (월 일) ");
		this.month1 = s.nextInt();
		this.day1 = s.nextInt();
		System.out.print("두번쨰 날짜를 입력하시오. (월 일) ");
		this.month2 = s.nextInt();
		this.day2 = s.nextInt();
		
		Date1=CalcDate(month1,day1);
		Date2=CalcDate(month2,day2);
		printDate(month1,day1,month2,day2,Date1,Date2);
	}
	
	int CalcDate(int month, int day) {
		int day_count=0;
		for(int i=0;i<month-1;i++) {
			day_count+=monthdays[i];
		}
		return day_count+=day;
	}
	void printDate(int month1, int day1,int month2, int day2,int date1,int date2) {
		if(((month1>12||month1<1)||(day1>monthdays[month1-1]||day1<1))||((month2>12||month2<1)||(day1>monthdays[month2-1]||day2<1))) {
			System.out.println("잘못 입력하셨습니다. ");
		}
		else {
				System.out.println("두 날짜의 간격은 "+Math.abs(date1-date2)+"일입니다. ");
		}
		
	}

}
