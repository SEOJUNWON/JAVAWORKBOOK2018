package workbook.StepB;

import java.util.Scanner;

public class stepB6 {
	private int total;
	private int kor;
	private int eng;
	private int math;
	private double average;
	
	public stepB6() {
		input();
	}
	
	public void printScore() {
		System.out.println("입력하신 점수의 총점은 "+getTotal()+" 이고,");
		System.out.printf("평균은 %.1f 입니다. \n",getAverage());
		if(this.kor>=90) {
			System.out.println("국어점수가 우수합니다. ");
		}
		if(this.eng>=90) {
			System.out.println("영어점수가 우수합니다. ");
		}
		if(this.math>=90) {
			System.out.println("수학점수가 우수합니다. ");
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
