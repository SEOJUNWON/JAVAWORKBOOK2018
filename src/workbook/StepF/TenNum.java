package workbook.stepF;

import java.util.Scanner;

public class TenNum {
	private int number[]= new int[10];
	private int newnum;
	private int count;
	private boolean dup;
	private int i=0;
	
	
	public TenNum() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("1부터 100사이의 숫자를 입력하시오. ");
		for(this.i=0;this.i<10;this.i++) {
			System.out.print((this.i+1)+"번째 숫자를 입력하시오. ");
			this.newnum=s.nextInt();
			getBoolean();
			if(this.dup) {
				System.out.println("잘못 입력하였습니다. 다시 입력하세요. ");
				this.i--;
			}
			else {
				this.number[this.i]=this.newnum;
			}
		}
	}
	void getBoolean() {
		for(int j=0;j<this.i;j++) {
			if(this.newnum==number[j]) {
				this.dup=true;
				break;
			}
			else {
				this.dup=false;
			}
		}
	}
	void printNum() {
		for(int j=0;j<10;j++) {
			System.out.println((j+1)+"번째 숫자는  "+this.number[j]+"입니다. ");
		}
		
	}

}
