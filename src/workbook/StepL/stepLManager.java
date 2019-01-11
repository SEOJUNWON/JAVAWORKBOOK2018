package workbook.StepL;

import java.util.Scanner;

public class stepLManager {
	public stepLManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("---------------------\n");
			System.out.printf("1. 메뉴판 저장\n");
			System.out.printf("2. 주차장 관리\n");
			System.out.printf("3. 식당 주문 관리\n");
			System.out.printf("4. 학생 정보 관리\n");
			System.out.printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				MENU type = new MENU();
				break;
			case 2: 				
				Parking type2 = new Parking();
				break;
			case 3: 				
				Restaurant type3 = new Restaurant();
				break;
			case 4: 				
				Student type4 = new Student();
				break;
			}
		}
	}
	void printf(String s){System.out.print(s);} 

	

}