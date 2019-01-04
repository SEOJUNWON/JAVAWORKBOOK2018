package workbook.StepI;

import java.util.Scanner;

public class Menu3 {
	public int order;
	public int total_sale=0;
	String type;
	int ord;
	int count=0;
	public Menu3(){
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true){
			ShowMenu();
			System.out.print("메뉴를 선택해주세요 : ");
			this.order = s.nextInt();
			System.out.print("더 필요하십니까?(Y/N) ");
			this.type = s.next();
			
			ord=SelectCan();
			this.total_sale += ord;
			count++;
			if(type.equalsIgnoreCase("N")) break;
			
		}
		
	}
	void printFee() {
		System.out.println(count+"개의 음료를 선택하여 총 "+this.total_sale+"원입니다. ");
	}
	void ShowMenu() {
		System.out.println("1.콜라(700원) 2.원두커피(300원) 3.레몬주스(1000원) \n4.홍차(500원) 5. 코코아(600원) ");
	}
	
	int SelectCan() {
		int price[] = {700,300,1000,500,600};
		
		return price[this.order-1];
	}
}