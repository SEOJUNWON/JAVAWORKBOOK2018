package workbook.stepD;
import java.util.Scanner;



public class stepDManager {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				sumToNum type = new sumToNum();
				type.printSum();
				break;
			case 2: 				
				maxMin type2 = new maxMin();
				type2.printMaxmin();
				break;
			case 3: 				
				sumAverage type3 = new sumAverage();
				type3.printSumAverage();
				break;
			case 4: 				
				countChild type4 = new countChild();
				type4.printChild();
				break;
			case 5: 				
				countRec type5 = new countRec();
				type5.printRec();
				break;
			case 6: 				
				countApt type6= new countApt();
				type6.printApt();
				break;
			case 7: 				
				calFunc type7= new calFunc();
				break;
			case 8: 				
				calFunc2 type8= new calFunc2();
				break;
			case 9: 				
				mulNine type9= new mulNine();
				break;
			case 10: 				
				exclusiveMul type10= new exclusiveMul();
				break;
			}
	}
	}
	void printf(String s){System.out.print(s);} 

	

}
