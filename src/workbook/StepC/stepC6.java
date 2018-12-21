package workbook.StepC;

import java.util.Scanner;

public class stepC6 {
	private int total;
	private int kor;
	private int eng;
	private int math;
	private double average;
	
	public stepC6() {
		input();
	}
	
	public void printScore() {
		System.out.println("입력하신 점수의 총점은 "+getTotal()+" 이고,");
		System.out.printf("평균은 %.1f 입니다. \n",getAverage());
		if(getAverage()>=90) {
			System.out.println("수 입니다. ");
		}
		else if(getAverage()>=80) {
			System.out.println("우 입니다. ");
		}
		else if(getAverage()>=70) {
			System.out.println("미 입니다. ");
		}
		else if(getAverage()>=60) {
			System.out.println("양 입니다. ");
		}
		else {
			System.out.println("가 입니다. ");
		}
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요. ");
		this.kor=s.nextInt();
		System.out.print("영어 점수를 입력하세요. ");
		this.eng=s.nextInt();
		System.out.print("수학 점수를 입력하세요. ");
		this.math=s.nextInt();
	}
	
	int getTotal() {
		this.total = kor+eng+math;
		return this.total;
	}
	double getAverage() {
		this.average = ((double)kor+(double)eng+(double)math)/3.0;
		return this.average;
	}
		
		
		

		
		
		
	

}
