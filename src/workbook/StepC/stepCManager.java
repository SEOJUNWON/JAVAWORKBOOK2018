package workbook.stepC;

import java.util.Scanner;

public class stepCManager {

	public static void main(String[] args) {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("---------------------\n");
			System.out.printf("1. 연령대 판정\n");
			System.out.printf("2. 물의온도 판정\n");
			System.out.printf("3. 직사각형 형태판정\n");
			System.out.printf("4. 아파트 평형 계산\n");
			System.out.printf("5. 연중 날짜 계산\n");
			System.out.printf("6. 점수계산\n");
			System.out.printf("7. 파일 전송시간 계산\n");
			System.out.printf("8. 최댓값,최솟값 구하기\n");
			System.out.printf("9. 소득세 계산\n");
			System.out.printf("10. 간단한 사칙연산 계산\n");
			System.out.printf("11. 윤년 판정\n");
			System.out.printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				stepC1 step = new stepC1();
				step.printAge();
				break;
			case 2: 				
				stepC2 step2 = new stepC2();
				step2.printDegree();
				break;
			case 3: 				
				stepC3 step3 = new stepC3();
				step3.printArea();
				break;
			case 4: 				
				stepC4 step4 = new stepC4();
				step4.printArea();
				break;
			case 5: 				
				stepC5 step5 = new stepC5();
				step5.printDay();
				break;
			case 6: 				
				stepC6 step6 = new stepC6();
				step6.printScore();
				break;
			case 7: 				
				stepC7 step7 = new stepC7();
				step7.printBytes();
				break;
			case 8: 				
				stepC8 step8 = new stepC8();
				step8.printResult();
				break;
			case 9: 				
				stepC9 step9 = new stepC9();
				step9.printTax();
				break;
			case 10: 				
				stepC10 step10 = new stepC10();
				step10.printResult();
				break;
			case 11: 				
				stepC11 step11 = new stepC11();
				step11.printResult();
				break;
			}
			
		}
		
	}
	void printf(String s){System.out.print(s);} 

	

}