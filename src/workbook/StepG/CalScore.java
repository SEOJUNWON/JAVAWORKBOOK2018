package workbook.StepG;

import java.util.Scanner;

public class CalScore {
	public int jumsu[][] = new int[5][3];
	public int subjectTotal[] = new int[3];
	public int studentTotal[] = new int[5];
	public double studentAverage[] = new double[5];
	String class_name[] = {"국어","영어","수학"};
	public int k;
	
	public CalScore(){
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print((i+1)+"번 학생의 국어, 영어, 수학 점수는? ");
			for(int j=0;j<3;j++) {
				this.jumsu[i][j] = s.nextInt();
			}
		}
			getTotal();
			getTotal2();
		
		
	}
	String getScore() {
		if(this.studentAverage[this.k]>=90) {
			return "A";
		}
		else if(this.studentAverage[this.k]>=80) {
			return "B";
		}
		else if(this.studentAverage[this.k]>=70) {
			return "C";
		}
		else if(this.studentAverage[this.k]>=60) {
			return "D";
		}
		else {
			return "F";
		}
	}
	
	void getTotal() {
		for(int j=0;j<3;j++) {
			for(int k=0;k<5;k++) {
				this.subjectTotal[j]+=this.jumsu[k][j];
			}
		}
	}
	void getTotal2() {
		for(int j=0;j<5;j++) {
			for(int k=0;k<3;k++) {
				this.studentTotal[j]+=this.jumsu[j][k];
			}

			this.studentAverage[j] = (double)this.studentTotal[j]/3.0;
		}
	}
	void printTotal1(){
		System.out.println("\n1) 각 과목별 총점과 평균 점수");
		for(int j=0;j<3;j++) {
			System.out.printf("%s 과목 총점은 %d 평균은 %.1f입니다.\n",class_name[j],this.subjectTotal[j],(double)this.subjectTotal[j]/5.0);
		}
		
	}
	void printTotal2(){
		System.out.println("\n2) 각 학생별 총점과 평균 점수");
		for(this.k=0;this.k<5;this.k++) {
			System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급 %s\n",this.k+1,this.studentTotal[this.k],this.studentAverage[this.k],getScore());
		}
		
	}
}