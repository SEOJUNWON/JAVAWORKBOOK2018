package workbook.StepJ;

import java.util.Scanner;


public class stepJManager {
	public stepJManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("---------------------\n");
			System.out.printf("1. 나이계산\n");
			System.out.printf("2. 심사점수 계산\n");
			System.out.printf("3. 물의온도구간 판정\n");
			System.out.printf("4. 날짜간격세기\n");
			System.out.printf("5. 주차관리 시스템\n");
			System.out.printf("6. 피보나치\n");
			System.out.printf("7. 2의 제곱수\n");
			System.out.printf("8. Ackermann\n");
			System.out.printf("9. 제곱구하기\n");
			System.out.printf("10. 황금비율\n");
			System.out.printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				CalAge type = new CalAge();
				type.printAge();
				break;
			case 2: 				
				CalScore type2 = new CalScore();
				type2.printScore();
				break;
			case 3: 				
				CalTemp type3 = new CalTemp();
				type3.printTemp();
				break;
			case 4: 				
				CalDate type4 = new CalDate();
				break;
			case 5: 				
				CalFee type5 = new CalFee();
				type5.printFee();
				break;
			case 6: 				
				Fibonacci1 type6 = new Fibonacci1();
				break;
			case 7: 				
				Square type7 = new Square();
				break;
			case 8: 				
				Ackermann type8 = new Ackermann();
				break;
			case 9: 				
				PowMethod type9 = new PowMethod();
				break;
			case 10: 				
				Fibonacci2 type10 = new Fibonacci2();
				break;
			}
		}
	}
	void printf(String s){System.out.print(s);} 

	

}
