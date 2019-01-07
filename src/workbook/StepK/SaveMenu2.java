package workbook.StepK;

import java.util.Scanner;

public class SaveMenu2 {
	MenuPan menu[]=new MenuPan[5];
	int how_many;
	
	public SaveMenu2() {
		Scanner s = new Scanner(System.in);
		System.out.print("등록하실 메뉴의 개수를 입력하세요 : ");
		how_many=s.nextInt();
		
		for(int i=0;i<how_many;i++) {
			menu[i] = new MenuPan();
			System.out.print((i+1)+"번 ");
			menu[i].input();
		}
		System.out.println("========================================================");
		System.out.println("메뉴번호\t메뉴명\t원산지\t1인분가격 ");
		for(int i=0;i<how_many;i++) {
			menu[i].print();
		}
		
	}
	
	
	
}
