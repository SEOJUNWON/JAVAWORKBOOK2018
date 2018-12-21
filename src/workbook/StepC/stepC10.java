package workbook.stepC;

import java.util.Scanner;

public class stepC10 {
	private int num1;
	private int num2;
	private int result;
	private String operator;
	
	public stepC10() {
		input();
	}
	
	public void printResult() {
		System.out.println("계산식의 결과 값은 "+getResult()+"입니다. ");
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요. ");
		this.num1=s.nextInt();
		System.out.print("두번째 숫자를 입력하세요. ");
		this.num2=s.nextInt();
		System.out.print("연산기호문자('+', '-', '*', '/' 중 1개)를 입력하세요. ");
		this.operator=s.next();
	}
	int getResult() {
		if(this.operator.equals("+")) {
			this.result=this.num1+this.num2;
		}
		else if(this.operator.equals("-")) {
			this.result=this.num1-this.num2;
		}
		else if(this.operator.equals("*")) {
			this.result=this.num1*this.num2;
		}
		else if(this.operator.equals("/")) {
			this.result=this.num1/this.num2;
		}
		return this.result;
	}
	
		
}