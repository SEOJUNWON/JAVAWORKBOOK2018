package workbook.StepI;

import java.util.Scanner;



public class stepIManager {
	public stepIManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("---------------------\n");
			System.out.printf("1. MENU1\n");
			System.out.printf("2. 직각삼각형 그리기\n");
			System.out.printf("3. BMI구하기\n");
			System.out.printf("4. MENU2\n");
			System.out.printf("5. 최댓값\n");
			System.out.printf("6. 랜덤숫자\n");
			System.out.printf("7. 자판기\n");
			System.out.printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				Menu1 type = new Menu1();
				type.printFee();
				break;
			case 2: 				
				Triangle type2 = new Triangle();
				type2.printTri();
				break;
			case 3: 				
				BMI type3 = new BMI();
				break;
			case 4: 				
				Menu2 type4 = new Menu2();
				type4.printFee();
				break;
			case 5: 				
				Max type5 = new Max();
				type5.printMax();
				break;
			case 6: 				
				RandomNum type6 = new RandomNum();
				type6.printResult();
				break;
			case 7: 				
				Menu3 type7 = new Menu3();
				type7.printFee();
				break;
			}
		}
	}
	void printf(String s){System.out.print(s);} 

	

}