package workbook.StepK;

import java.util.Scanner;

public class stepKManager {
	public stepKManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("---------------------\n");
			System.out.printf("1. 메뉴판 저장\n");
			System.out.printf("2. 메뉴판 여러개 저장\n");
			System.out.printf("3. 좌표 저장\n");
			System.out.printf("4. 좌표 여러개 저장\n");
			System.out.printf("5. 사용자 목록 저장\n");
			System.out.printf("6. 여러사용자 목록 저장\n");
			System.out.printf("7. 학생 점수 저장\n");
			System.out.printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				SaveMenu type = new SaveMenu();
				break;
			case 2: 				
				SaveMenu2 type2 = new SaveMenu2();
				break;
			case 3: 				
				Coordinate type3 = new Coordinate();
				break;
			case 4: 				
				Coordinate2 type4 = new Coordinate2();
				break;
			case 5: 				
				SaveUser type5 = new SaveUser();
				break;
			case 6: 				
				SaveUser2 type6 = new SaveUser2();
				break;
			case 7: 				
				StudentScore type7 = new StudentScore();
				break;
			}
		}
	}
	void printf(String s){System.out.print(s);} 

	

}
