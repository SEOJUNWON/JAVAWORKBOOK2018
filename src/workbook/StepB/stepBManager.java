package workbook.StepB;
import java.util.Scanner;

public class stepBManager {

	public stepBManager() {
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
			System.out.printf("8. 숫자 조건 판정\n");
			System.out.printf("9. 비만 판정\n");
			System.out.printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				stepB1 step = new stepB1();
				step.printAge();
				break;
			case 2: 				
				stepB2 step2 = new stepB2();
				step2.printDegree();
				break;
			case 3: 				
				stepB3 step3 = new stepB3();
				step3.printArea();
				break;
			case 4: 				
				stepB4 step4 = new stepB4();
				step4.printArea();
				break;
			case 5: 				
				stepB5 step5 = new stepB5();
				step5.printSeconds();
				break;
			case 6: 				
				stepB6 step6 = new stepB6();
				step6.printScore();
				break;
			case 7: 				
				stepB7 step7 = new stepB7();
				step7.printBytes();
				break;
			case 8: 				
				stepB8 step8 = new stepB8();
				step8.printResult();
				break;
			case 9: 				
				stepB9 step9 = new stepB9();
				step9.printBmi();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 

	

}

		
