package workbook.StepH;

import java.util.Scanner;


public class stepHManager {
	public stepHManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("---------------------\n");
			System.out.printf("1. 숫자 맞추기\n");
			System.out.printf("2. 로또 번호생성\n");
			System.out.printf("3. 로또 맞추기\n");
			System.out.printf("4. 가위바위보 게임\n");
			System.out.printf("5. 슬롯머신\n");
			System.out.printf("6. 제곱수 조합\n");
			System.out.printf("7. 문자의 개수\n");
			System.out.printf("8. 문자열 바꾸기\n");
			System.out.printf("9. 사용자 정보\n");
			System.out.printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				QuizNum type = new QuizNum();
				type.printAnswer();
				break;
			case 2: 				
				Lotto type2 = new Lotto();
				break;
			case 3: 				
				HitLotto type3 = new HitLotto();
				type3.printNum();
				break;
			case 4: 				
				RSPgame type4 = new RSPgame();
				type4.printResult();
				break;
			case 5: 				
				Slotmachine type5 = new Slotmachine();
				break;
			case 6: 				
				FiveSquare type6 = new FiveSquare();
				type6.printNum();
				break;
			case 7: 				
				PrintString type7 = new PrintString();
				type7.fin();
				break;
			case 8:
				ChangeStr type8 = new ChangeStr();
				type8.fin();
			case 9:
				UserInfo type9 = new UserInfo();
				type9.fin();
			}
		}
	}
	void printf(String s){System.out.print(s);} 

	

}