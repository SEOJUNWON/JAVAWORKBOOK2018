package workbook.StepH;

import java.util.*;

public class FiveSquare {
	private int num[]=new int[5];
	private int pow_value[][]=new int[5][5];
	private int max_num=0;
	private int min_num=999999999;
	private int max_a;
	private int max_b;
	private int min_a;
	private int min_b;
	
	public FiveSquare(){
		input();
		
	}
	
	void printNum() {
		System.out.println("\n입력하신 5개의 수로 제곱수를 만들면...");
		System.out.printf("가장 큰수는 %d의 %d승인 %d입니다. \n",num[max_a],num[max_b],pow_value[max_a][max_b]);
		System.out.printf("가장 작은 수는 %d의 %d승인 %d입니다. \n",num[min_a],num[min_b],pow_value[min_a][min_b]);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
			System.out.print("2에서 9사이의 숫자 5개를 입력하세요. ");
			for(int i=0;i<5;i++) {
				num[i]=s.nextInt();
			}
			square();
			getMax();
			getMin();
			
		
		
	}
	
	void square() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				pow_value[i][j]=(int)Math.pow(num[i],num[j]);
			}
		}
	}
	
	void getMax() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j) continue;
				if(this.pow_value[i][j]>this.max_num) {
					this.max_num=this.pow_value[i][j];
					this.max_a=i;
					this.max_b=j;
				}
			}
	}
	}
	
	void getMin() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j) continue;
				if(this.pow_value[i][j]<this.min_num) {
					this.min_num=this.pow_value[i][j];
					this.min_a=i;
					this.min_b=j;
			
				}
			}
	}
	}
	
}