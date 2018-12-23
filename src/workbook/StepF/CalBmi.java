package workbook.stepF;

import java.util.Scanner;

public class CalBmi {
	private int bmilist[][]= new int[10][3];
	private double bmi;
	private int count;
	private int weight,height;
	
	
	public CalBmi() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+"번째 사람의 신장(cm)과 체중(kg)을 입력하시오. ");
			for(int j=0;j<2;j++) {
				this.bmilist[i][j]=s.nextInt();
			}
		}
	}
	
	
	void printBmi() {

		for(int i=0;i<10;i++) {
			this.bmi=(double)this.bmilist[i][1]/(((double)this.bmilist[i][0]*0.01)*((double)this.bmilist[i][0]*0.01));
			this.bmilist[i][2]=(int)this.bmi;
			if(this.bmi>=25) {
				count++;
				System.out.println((i+1)+"번째 사람은 비만입니다. ");
				
			}
		}
		System.out.println("\n총 "+count+"명의 사람이 비만입니다. ");
		
	}

}