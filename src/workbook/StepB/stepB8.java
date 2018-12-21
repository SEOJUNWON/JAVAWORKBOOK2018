package workbook.stepB;

import java.util.Scanner;

public class stepB8 {
	private int num1;
	private int num2;
	private int num3;
	
	public stepB8() {
		input();
	}
	
	public void printResult() {
		if(this.num1==this.num2||this.num2==this.num3||this.num1==this.num3) {
			System.out.println("1번 조건 만족 : 3개의 숫자 중 적어도 두 수의 값이 같다. ");
		}
		if((this.num1>50&&this.num2>50)||(this.num2>50&&this.num3>50)||(this.num1>50&&this.num3>50)) {
			System.out.println("2번 조건 만족 : 3개의 숫자 중 적어도 두 수의 크기가 모두 50 보다 크다. ");
		}
		if(((this.num1+this.num2)==this.num3)||((this.num2+this.num3)==this.num1)||((this.num1+this.num3)==this.num2)) {
			System.out.println("3번 조건 만족 : 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같다. ");
		}
		if(((num2%num1==0)&&(num3%num1==0))||((num3%num2==0)&&(num1%num2==0))||((num1%num3==0)&&(num2%num3==0))) {
			System.out.println("4번 조건 만족 : 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어떨어지는 경우가 있다. ");
		}
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
	
		
}
