package workbook.StepM;

import java.util.Scanner;



public class stepMManager {
	public stepMManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("---------------------\n");
			System.out.printf("1. 메뉴판 저장\n");
			System.out.printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				FileMenu type = new FileMenu();
				break;
			
			}
		}
	}
	void printf(String s){System.out.print(s);} 

	

}