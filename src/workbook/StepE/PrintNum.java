package workbook.stepE;

import java.util.Scanner;

public class PrintNum {
	private int row;
	private int column;
	private int number;
	private int i,j;
	
	public PrintNum() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("출력하려는 행의 크기와 행의 크기를 입력하시오. ");
		this.row=s.nextInt();
		this.column=s.nextInt();
		
	}
	
	void getResult() {
		for(i=1;i<=this.row;i++) {
			for(j=1;j<=this.column;j++) {
				System.out.printf("%4d",i*j);
				
			}
			System.out.print("\n");
		}
	}
}