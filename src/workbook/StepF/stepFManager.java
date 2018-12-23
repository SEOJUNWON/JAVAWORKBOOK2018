package workbook.stepF;

import java.util.Scanner;



public class stepFManager {
	public stepFManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("---------------------\n");
			System.out.printf("1. 두번째로 큰수의 순\n");
			System.out.printf("2. 심사점수 계산\n");
			System.out.printf("3. 과목별 성적계산\n");
			System.out.printf("4. 학생별 성적계산\n");
			System.out.printf("5. 비만 판정\n");
			System.out.printf("6. 아파트의 거주자 수\n");
			System.out.printf("7. 아파트 층별,호수별 거주자 수\n");
			System.out.printf("8. 겹치지않는 숫자 입력\n");
			System.out.printf("9. 연중 날짜 계산\n");
			System.out.printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				SecondNum type = new SecondNum();
				type.printSecond();
				break;
			case 2: 				
				CalScore type2 = new CalScore();
				type2.printScore();
				break;
			case 3: 				
				CalScore2 type3 = new CalScore2();
				type3.printScore();
				break;
			case 4: 				
				CalScore3 type4 = new CalScore3();
				type4.printScore();
				break;
			case 5: 				
				CalBmi type5 = new CalBmi();
				type5.printBmi();
				break;
			case 6: 				
				Resident type6 = new Resident();
				type6.printResident();
				break;
			case 7: 				
				Resident2 type7 = new Resident2();
				type7.printResident();
				break;
			case 8: 				
				TenNum type8 = new TenNum();
				type8.printNum();
				break;
			case 9: 				
				CalDate type9 = new CalDate();
				type9.printDate();
				break;
			
			
			}
			}
	}
	void printf(String s){System.out.print(s);} 

	

}