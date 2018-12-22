package workbook.stepE;

import java.util.Scanner;



public class stepEManager {
	public stepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("---------------------\n");
			System.out.printf("1. 1부터 더하기\n");
			System.out.printf("2. 최댓값, 최솟값\n");
			System.out.printf("3. 합계와 평균\n");
			System.out.printf("4. 미성년자 계산\n");
			System.out.printf("5. 직사각형의 개수\n");
			System.out.printf("6. 아파트 평형과 종류n");
			System.out.printf("7. 1차함수의 좌표\n");
			System.out.printf("8. 2차함수의 좌표\n");
			System.out.printf("9. 구구단 출력\n");
			System.out.printf("10. 배타배수 출력\n");
			System.out.printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				PrintRec type = new PrintRec();
				type.printRec();
				break;
			case 2: 				
				PrintTri type2 = new PrintTri();
				type2.printTri();
				break;
			case 3: 				
				PrintTri2 type3 = new PrintTri2();
				type3.printTri();
				break;
			case 4: 				
				Gugudan type4 = new Gugudan();
				break;
			case 5: 				
				Gugudan2 type5 = new Gugudan2();
				break;
			
			case 6: 				
				PrintNum type6 = new PrintNum();
				type6.getResult();
				break;
			
			}
			}
	}
	void printf(String s){System.out.print(s);} 

	

}