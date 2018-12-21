package workbook.stepC;

import java.util.Scanner;

public class stepC8 {
	private int num1;
	private int num2;
	private int num3;
	private int max_num;
	private int min_num;
	
	public stepC8() {
		input();
	}
	
	public void printResult() {
		System.out.println("가장 큰 수는 "+getMax()+" 이고, 가장 작은 수는 "+getMin()+" 입니다. " );
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요. ");
		this.num1=s.nextInt();
		System.out.print("두번째 숫자를 입력하세요. ");
		this.num2=s.nextInt();
		System.out.print("세번째 숫자를 입력하세요. ");
		this.num3=s.nextInt();
	}
	
	int getMax() {
		if(this.num1>=this.num2) {
			if(this.num1>this.num3) {
				this.max_num=this.num1;
			}
			else {
				this.max_num=this.num3;
			}
		}
		else if(this.num1>=this.num3) {
			if(this.num1>this.num2) {
				this.max_num=this.num1;
			}
			else {
				this.max_num=this.num2;
			}
		}
		else if(this.num2>=this.num3) {
			if(this.num2>this.num1) {
				this.max_num=this.num2;
			}
			else {
				this.max_num=this.num1;
			}
		}
		else if(this.num2>=this.num1) {
			if(this.num2>this.num3) {
				this.max_num=this.num2;
			}
			else {
				this.max_num=this.num3;
			}
		}
		else if(this.num3>=this.num2) {
			if(this.num3>this.num1) {
				this.max_num=this.num3;
			}
			else {
				this.max_num=this.num1;
			}
		}
		else if(this.num3>=this.num1) {
			if(this.num3>this.num2) {
				this.max_num=this.num3;
			}
			else {
				this.max_num=this.num2;
			}
		}
		return this.max_num;
	}
	int getMin() {
		if(this.num1>=this.num2) {
			if(this.num3>this.num2) {
				this.min_num=this.num2;
			}
			else {
				this.min_num=this.num3;
			}
		}
		else if(this.num1>=this.num3) {
			if(this.num2>this.num3) {
				this.min_num=this.num3;
			}
			else {
				this.min_num=this.num2;
			}
		}
		else if(this.num2>=this.num3) {
			if(this.num1>this.num3) {
				this.min_num=this.num3;
			}
			else {
				this.min_num=this.num1;
			}
		}
		else if(this.num2>=this.num1) {
			if(this.num3>this.num1) {
				this.min_num=this.num1;
			}
			else {
				this.min_num=this.num3;
			}
		}
		else if(this.num3>=this.num2) {
			if(this.num1>this.num2) {
				this.min_num=this.num2;
			}
			else {
				this.min_num=this.num1;
			}
		}
		else if(this.num3>=this.num1) {
			if(this.num2>this.num1) {
				this.min_num=this.num1;
			}
			else {
				this.min_num=this.num2;
			}
		}
		return this.min_num;
	}
	
		
}