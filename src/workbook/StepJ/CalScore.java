package workbook.StepJ;

import java.util.Scanner;

public class CalScore {
	private double score[]= new double[10];
	
	private double total=0;
	private double average;
	
	
	public CalScore() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+"번 심사점수를 입력하시오. ");
			this.score[i]=s.nextDouble();
		}
		
		
	}
	double getTotal() {
		double a,b;
		a=Max(this.score);
		b=Min(this.score);
		this.total-=a+b;
		for(int i=0;i<10;i++) {
			this.total+=this.score[i];
		}
		return this.total;
		
	}
	
	double getAverage() {
		this.average=getTotal()/8.0;
		return this.average;
	}
	
	void printScore() {
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다. \n",getAverage());
	}
	double Max(double num[]) {
		double maxscore=-999999999;
		
		for(int i=0;i<10;i++) {
			if(num[i]>maxscore) {
				maxscore=num[i];
			}
		}
		return maxscore;
		
	}
	double Min(double num[]) {
		double minscore=999999999;
		for(int i=0;i<10;i++) {
			if(num[i]<=minscore) {
			minscore=num[i];
			}
		}
		return minscore;
	}
}