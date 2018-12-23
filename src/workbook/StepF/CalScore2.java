package workbook.stepF;

import java.util.Scanner;

public class CalScore2 {

	
	private int jumsu[][]= new int[5][3];
	private int sum[]=new int[3];
	private double average[]=new double[3];
	private int kor,eng,math;
	
	
	public CalScore2() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print((i+1)+"번 학생 국어,영어, 수학 점수를 입력하시오. ");
			for(int j=0;j<3;j++) {
				this.jumsu[i][j]=s.nextInt();
				this.sum[j]+=this.jumsu[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			this.average[i]=(double)this.sum[i]/5;
		}
	}
	int getKorTotal() {
		return this.sum[0];
	}
	int getEngTotal() {
		return this.sum[1];
	}
	int getMathTotal() {
		return this.sum[2];
	}
	
	double getKorAverage() {
		return this.average[0];
	}
	double getEngAverage() {
		return this.average[1];
	}
	double getMathAverage() {
		return this.average[2];
	}
	
	void printScore() {
		System.out.printf("국어의 총점은 %d 이고, 평균은 %.1f 입니다. \n",getKorTotal(),getKorAverage());
		System.out.printf("영어의 총점은 %d 이고, 평균은 %.1f 입니다. \n",getEngTotal(),getEngAverage());
		System.out.printf("수학의 총점은 %d 이고, 평균은 %.1f 입니다. \n",getMathTotal(),getMathAverage());
	}

}