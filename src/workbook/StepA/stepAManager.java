package workbook.StepA;

import java.util.Scanner;


public class stepAManager {

	public stepAManager() {
			int menu;
			Scanner s = new Scanner(System.in);
			while(true) {
				System.out.printf("---------------------\n");
				System.out.printf("1. 나이계산\n");
				System.out.printf("2. 온도변환\n");
				System.out.printf("3. 직사각형 넓이계산\n");
				System.out.printf("4. 아파트 평형 계산\n");
				System.out.printf("5. 날짜계산\n");
				System.out.printf("6. 점수계산\n");
				System.out.printf("7. 파일 용량 계산\n");
				System.out.printf("=>원하는 메뉴는?(0:exit) :");
				menu = s.nextInt();
				if(menu == 0) break;
				switch(menu) {
				case 1: 				
					stepA1 step = new stepA1();
					step.printAge();
					break;
				case 2: 				
					stepA2 step2 = new stepA2();
					step2.printDegree();
					break;
				case 3: 				
					stepA3 step3 = new stepA3();
					step3.printArea();
					break;
				case 4: 				
					stepA4 step4 = new stepA4();
					step4.printArea();
					break;
				case 5: 				
					stepA5 step5 = new stepA5();
					step5.printSeconds();
					break;
				case 6: 				
					stepA6 step6 = new stepA6();
					step6.printScore();
					break;
				case 7: 				
					stepA7 step7 = new stepA7();
					step7.printBytes();
					break;
				}
			}
			
		}
		void printf(String s){System.out.print(s);} 

		

	
	

}
