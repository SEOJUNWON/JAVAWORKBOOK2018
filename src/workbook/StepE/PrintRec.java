package workbook.stepE;

import java.util.Scanner;

public class PrintRec {
	private int length;
	private int i,j;
	
	public PrintRec(){
		input();
		
	}
	
	void printRec() {
		getRec();
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("정사각형의 크기를 입력하시오. ");
		this.length=s.nextInt();
		
		
	}
	
	
	void getRec() {
		for(i=0;i<this.length;i++) {
			for(j=0;j<this.length;j++) {
				System.out.print("# ");
			}
			System.out.print("\n");
		}
	}
}