package workbook.StepI;

import java.util.Scanner;

public class Menu2 {
	public int order;
	public int total_sale=0;
	int ord;
	public Menu2(){
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true){
			ShowMenu();
			System.out.print("메뉴를 선택해주세요.(종료 : 5) ");
			this.order = s.nextInt();
			
			ord=SelectMenu();
			if(ord==-1) break;
			this.total_sale += ord;
			System.out.println("현재까지의 주문 금액은 "+this.total_sale+"원입니다. \n");
			
			
		}
		
	}
	void printFee() {
		System.out.println("\n\n총 주문 금액은 "+this.total_sale+"원입니다. ");
	}
	void ShowMenu() {
		System.out.println("1. 피자(15,000원) 2. 스파게티(10,000원) 3. 샐러드(7,000원) 4. 음료수(2,000원) ");
	}
	
	int SelectMenu() {
		int price[] = {15000,10000,7000,2000,-1};
		
		return price[this.order-1];
	}
}