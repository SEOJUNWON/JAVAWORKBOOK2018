package workbook.StepH;

import java.util.Scanner;

public class UserInfo {
	public String input;
	public int i;
	String userList[];
	String userInfo[];
	
	public UserInfo() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("========================================");
			System.out.print("=> 문자열을 입력하세요 (x: 종료) : ");
			this.input = s.nextLine();
			if(this.input.equalsIgnoreCase("X"))break;
			getUser();
		}
	}
	
	void getUser(){
		
		find();
		System.out.println("\n=> 총 "+this.i+"명이 등록되었습니다.");
		String userList[]=this.input.split("###");
		for(int j=0;j<this.i;j++) {
			String userInfo[]=userList[j].split("\\|");
			System.out.println((j+1)+" "+userInfo[0]+" "+userInfo[1]);
		}
	}
	void find() {
		int direction=-1;
		while(true) {
			direction=this.input.indexOf("###",direction+1);
			if(direction==-1) break;
			this.i++;
		}
		
	}
	void fin() {
		System.out.println("* 종료되었습니다. ");
	}
	
}