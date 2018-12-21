package workbook.StepB;

import java.util.Scanner;

public class stepB5 {
	private int days;
	private int seconds;
	private int million=0;
	public stepB5() {
		input();
	}
	
	public void printSeconds() {
		System.out.println("날 수에 해당되는 시간은 모두 "+(long)getSeconds()+" 초입니다.");
		if(getMillion()>0) {
			System.out.println("100만 초가 모두 "+getMillion()+"번이나 포함됩니다.");
		}
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("날 수를 입력하세요. ");
		this.days=s.nextInt();
	}
	
	double getSeconds() {
		this.seconds=days*24*60*60;
		return this.seconds;
	}
	int getMillion() {
		this.million=this.seconds/1000000;
		return this.million;
	}
}
