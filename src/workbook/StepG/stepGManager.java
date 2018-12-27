package workbook.StepG;

import java.util.Scanner;

public class stepGManager {
	public stepGManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("---------------------\n");
			System.out.printf("1. 나이 계산, 연령대 판정\n");
			System.out.printf("2. 물의 온도\n");
			System.out.printf("3. 점수 계산\n");
			System.out.printf("4. 부동산 중개수수료 계산\n");
			System.out.printf("5. PC방 이용료 계산\n");
			System.out.printf("6. 쇼핑몰 매출 계산\n");
			System.out.printf("7. 놀이공원 매표소\n");
			System.out.printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				CalAge type = new CalAge();
				type.printAge();
				break;
			case 2: 				
				CalTemp type2 = new CalTemp();
				type2.printTemp();
				break;
			case 3: 				
				CalScore type3 = new CalScore();
				type3.printTotal1();
				type3.printTotal2();
				break;
			case 4: 				
				CalFee type4 = new CalFee();
				type4.printFee();
				break;
			case 5: 				
				PCFee type5 = new PCFee();
				type5.printFee();
				break;
			case 6: 				
				CalMall type6 = new CalMall();
				type6.printFee();
				break;	
			case 7: 				
				CalTicket type7 = new CalTicket();
				type7.printFee();
				break;	
			}
		}
	}
	void printf(String s){System.out.print(s);} 

	

}
