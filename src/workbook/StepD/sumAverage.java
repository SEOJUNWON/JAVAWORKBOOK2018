package workbook.StepD;

import java.util.Scanner;

public class sumAverage {
	private int number;
	private int count=0;
	private int totalsum;
	private double average;
	
	public sumAverage(){
		input();
		
	}
	
	void printSumAverage() {
		System.out.println("입력한 10개의 숫자들의 총합계는 "+getSum()+"이고, 평균값은 "+getAverage()+" 입니다. ");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("0부터 100 사이의 숫자를 입력하세요. ");
			this.number=s.nextInt();
			if(!(this.number<=100&&this.number>=0)) break;
			
			this.totalsum+=this.number;
			this.count++;
			
		}
		
		
	}
	
	int getSum() {
		return totalsum;
	}
	double getAverage() {
		this.average=(double)this.totalsum/count;
		return average;
	}
	
}
