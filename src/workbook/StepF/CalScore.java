package workbook.stepF;

import java.util.Scanner;

public class CalScore {

	private double score[]= new double[10];
	private double maxscore=-999999999;
	private double minscore=999999999;
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
			if(score[i]>this.maxscore) {
				this.maxscore=this.score[i];
			}
			else if(score[i]<this.minscore) {
				this.minscore=this.score[i];
			}
		}
		
	}
	double getTotal() {
		for(int i=0;i<10;i++) {
			this.total+=this.score[i];
		}
		this.total=this.total-this.maxscore-this.minscore;
		return this.total;
	}
	
	double getAverage() {
		this.average=getTotal()/8;
		return this.average;
	}
	
	void printScore() {
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다. \n",getAverage());
	}

}