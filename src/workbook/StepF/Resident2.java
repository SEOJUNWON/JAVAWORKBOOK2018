package workbook.stepF;

import java.util.Scanner;

public class Resident2 {
	private int number[][]= new int[5][3];
	private int total;
	private int floor_total[]= new int[5];
	private int line_total[]= new int[3];
	
	
	public Resident2() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.print((i+1)+"0"+(j+1)+"호에 살고 있는 사람의 숫자를 입력하시오. ");
				this.number[i][j]=s.nextInt();
				this.floor_total[i]+=this.number[i][j];
				this.line_total[j]+=this.number[i][j];
				this.total+=this.number[i][j];
			}
		}
	}
	
	void printResident() {
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"층에 사는 거주자는 모두 "+this.floor_total[i]+"명 입니다. ");
		}
		System.out.print("\n");
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"호 라인에 사는 거주자는 모두 "+this.line_total[i]+"명 입니다. ");
		}
		System.out.print("\n");
		System.out.println("이 아파트에 사는 거주자는 모두 "+this.total+"명 입니다. ");
		
		
	}

}