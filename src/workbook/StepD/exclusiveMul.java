package workbook.stepD;

import java.util.Scanner;

public class exclusiveMul {
	private int num1,num2;
	private int dev1,dev2;
	private int samenum;
	
	public exclusiveMul() {
		input();
	}
	
	void input() {
		int count=0;
		Scanner s = new Scanner(System.in);
		System.out.print("2개의 숫자를 입력하시오. ");
		this.num1=s.nextInt();
		this.num2=s.nextInt();
		
		this.dev1=100/num1;
		this.dev2=100/num2;
		
		for(int k=1;k<=this.dev1;k++) {
			for(int l=1;l<=this.dev2;l++) {
				if((this.num1*k)==(this.num2*l)) {
					this.samenum=this.num1*k;
					count=1;
					break;
				}
			}
			if(count==1) break;
		}
		
		for(int i=1;i<=100;i++) {
			for(int j=1;j<dev1+dev2;j++) {
				if(this.samenum*j==i) {
					break;
				}
				if(this.num1*j==i||this.num2*j==i) {
					
					System.out.print(i+", ");
					break;
				}
			}
			
			
		}
		System.out.print("\n");
		
	}
	
	

}