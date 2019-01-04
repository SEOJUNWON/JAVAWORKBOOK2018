package workbook.StepH;

import java.util.Scanner;

public class ChangeStr {
	public String input;
	public String findStr;
	public String replaceStr;
	public int i;
	
	public ChangeStr() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("========================================");
			System.out.print("=> 문자열을 입력하세요 (x: 종료) : ");
			this.input = s.nextLine();
			if(this.input.equalsIgnoreCase("X"))break;
			change();
		}
	}
	
	void change(){
		Scanner s = new Scanner(System.in);
		System.out.print("=> 찾을 문자열을 입력하세요 : ");
		this.findStr = s.nextLine();
		System.out.print("=> 바꿀 문자열을 입력하세요 : ");
		this.replaceStr = s.nextLine();
		String k = this.input.replace(this.findStr, this.replaceStr);

		find();
		
		
		System.out.println("\n=> 총 "+this.i+"번 바뀌었습니다. ");
		System.out.println("=> "+k+"\n");
	}
	void find() {
		int direction=-1;
		while(true) {
			direction=this.input.indexOf(this.findStr,direction+1);
			if(direction==-1) break;
			this.i++;
		}
		
	}
	void fin() {
		System.out.println("* 종료되었습니다. ");
	}
	
}
