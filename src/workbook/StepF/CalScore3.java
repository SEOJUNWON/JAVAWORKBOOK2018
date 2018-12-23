package workbook.stepF;

import java.util.Scanner;

public class CalScore3 {
	private int jumsu[][]= new int[5][3];
	private int sum[]=new int[5];
	private double average[]=new double[5];
	private int kor,eng,math;
	
	
	public CalScore3() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print((i+1)+"번 학생 국어,영어, 수학 점수를 입력하시오. ");
			for(int j=0;j<3;j++) {
				this.jumsu[i][j]=s.nextInt();
				this.sum[i]+=this.jumsu[i][j];
			}
		}
		for(int i=0;i<5;i++) {
			this.average[i]=(double)this.sum[i]/3;
		}
	}
	int get1Total() {
		return this.sum[0];
	}
	int get2Total() {
		return this.sum[1];
	}
	int get3Total() {
		return this.sum[2];
	}
	int get4Total() {
		return this.sum[3];
	}
	int get5Total() {
		return this.sum[4];
	}
	
	double get1Average() {
		return this.average[0];
	}
	double get2Average() {
		return this.average[1];
	}
	double get3Average() {
		return this.average[2];
	}
	double get4Average() {
		return this.average[3];
	}
	double get5Average() {
		return this.average[4];
	}
	
	void printScore() {
		System.out.printf("1번 학생의 총점은 %d 이고, 평균은 %.1f 입니다. \n",get1Total(),get1Average());
		System.out.printf("2번 학생의 총점은 %d 이고, 평균은 %.1f 입니다. \n",get2Total(),get2Average());
		System.out.printf("3번 학생의 총점은 %d 이고, 평균은 %.1f 입니다. \n",get3Total(),get3Average());
		System.out.printf("4번 학생의 총점은 %d 이고, 평균은 %.1f 입니다. \n",get4Total(),get4Average());
		System.out.printf("5번 학생의 총점은 %d 이고, 평균은 %.1f 입니다. \n",get5Total(),get5Average());
	}

}