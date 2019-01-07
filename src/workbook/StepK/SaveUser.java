package workbook.StepK;

import java.util.Scanner;

public class SaveUser {
	public SaveUser() {
		UserInfo user = new UserInfo();
		user.input();
		System.out.println("===============================");
		System.out.println("등록된 학생 목록은 다음과 같습니다. ");
		System.out.println("-------------------------------");
		System.out.println("번호\t아이디\t비밀번호");
		System.out.print("1");
		user.print();
}
}
class UserInfo{
	public String password;
	public String id;
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("학생의 아이디, 비밀번호를 입력하시오 --> ");
		this.id=s.next();
		this.password=s.next();
		
		
	}
	void print() {
		
		System.out.println("\t"+id+"\t"+password);
	
	}
	
}