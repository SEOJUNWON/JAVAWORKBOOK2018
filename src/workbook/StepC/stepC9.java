package workbook.stepC;

import java.util.Scanner;

public class stepC9 {
	private int income;
	private int tax;
	
	public stepC9() {
		input();
	}
	
	public void printTax() {
			System.out.println("연봉 금액에 대한 소득세는 "+getTax()+"원 입니다. ");
		
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("연봉(원 단위)을 숫자로 입력하세요. ");
		this.income = s.nextInt();
		
	}
	
	int getTax() {
		if(this.income<10000000) {
			this.tax=this.income*95/1000;
		}
		else if(this.income<40000000) {
			this.tax=this.income*19/100;
		}
		else if(this.income<80000000) {
			this.tax=this.income*28/100;
		}
		else {
			this.tax=this.income/100*37;
		}
		return this.tax;
	}
		
		
		
	
}
