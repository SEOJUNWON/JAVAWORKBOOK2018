package workbook.stepF;

import java.util.Scanner;

public class Resident {
	private int number[][]= new int[5][3];
	private int total;
	
	
	public Resident() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.print((i+1)+"0"+(j+1)+"호에 살고 있는 사람의 숫자를 입력하시오. ");
				this.number[i][j]=s.nextInt();
				this.total+=this.number[i][j];
			}
		}
	}
	
	void printResident() {
		System.out.println("이 아파트에 사는 거주자는 모두 "+this.total+"명 입니다. ");
		
	}

}