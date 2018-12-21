package workbook.stepD;

import java.util.Scanner;

public class maxMin {
	private int number;
	private int max_num;
	private int min_num;
	
	public maxMin(){
		input();
		
	}
	
	void printMaxmin() {
		System.out.println("입력된 숫자들 중 가장 큰 수는 "+getMax()+"이고, 가장 작은 수는 "+getMin()+" 입니다. ");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		this.max_num=-1;
		this.min_num=200;
		while(true) {
			System.out.print("0부터 100 사이의 숫자를 입력하세요. ");
			this.number=s.nextInt();
			if(!(this.number<=100&&this.number>=0)) break;
			
			if(this.number>this.max_num) {
				this.max_num=this.number;
			}
			if(this.number<this.min_num) {
				this.min_num=this.number;
			}
		}
		
		
	}
	
	int getMax() {
		return max_num;
	}
	int getMin() {
		return min_num;
	}
	
}