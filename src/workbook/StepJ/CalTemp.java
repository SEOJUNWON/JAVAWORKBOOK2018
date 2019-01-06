package workbook.StepJ;

import java.util.Scanner;

public class CalTemp {
	double input_degree;
	public double degrees[] = new double[10];
	String degree_name[] = {"냉수", "미온수", "온수", "끓는물"};
	public int count[] = {0,0,0,0};
	public int i;
	int sel;
	
	public CalTemp(){
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(this.i=0;this.i<10;this.i++) {
			System.out.print((this.i+1)+"번 물의 온도를 입력하시오. ");
			this.input_degree = s.nextDouble();
			if(this.input_degree<0) {
				System.out.println("잘못입력하셨습니다. ");
				this.i--;
				continue;
			}
			this.degrees[this.i]= input_degree;
			count[AskWater(input_degree)]++;
			
		}
		
	}
	
	byte AskWater(double degree) {
		if(degree<25) {
			return 0;
		}
		else if(degree<40) {
			return 1;
		}
		else if(degree<80) {
			return 2;
		}
		else {
			return 3;
		}
	}
	
	void printTemp() {
		for(int j=0;j<10;j++) {
			System.out.print((j+1)+"번 물의 온도는 "+this.degrees[j]+"도 입니다. ");
					if(this.degrees[j]<25) {
						System.out.println(degree_name[0]);
					}
					else if(this.degrees[j]<40) {
						System.out.println(degree_name[1]);
					}
					else if(this.degrees[j]<80) {
						System.out.println(degree_name[2]);
					}
					else {
						System.out.println(degree_name[3]);
					};
		}
		for(int j=0; j<4;j++) {
			System.out.println(degree_name[j]+" 입력 횟수 : "+this.count[j]);
		}
	}
}
