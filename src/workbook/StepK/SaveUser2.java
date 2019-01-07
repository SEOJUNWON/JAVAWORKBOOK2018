package workbook.StepK;

import java.util.Scanner;

public class SaveUser2 {
	
	int how_many;
	
	public SaveUser2() {
		Scanner s = new Scanner(System.in);
		System.out.print("등록할 학생의 명수는? ");
		how_many=s.nextInt();
		UserInfo user[]=new UserInfo[how_many];
		
		for(int i=0;i<how_many;i++) {
			System.out.print((i+1)+"번 ");
			user[i]=new UserInfo();
			user[i].input();
		}
		System.out.println("===============================");
		System.out.println("등록된 학생 목록은 다음과 같습니다. ");
		System.out.println("-------------------------------");
		System.out.println("번호\t아이디\t비밀번호");
		for(int i=0;i<how_many;i++) {
			System.out.print((i+1));
			user[i].print();
		}
		
	}
}