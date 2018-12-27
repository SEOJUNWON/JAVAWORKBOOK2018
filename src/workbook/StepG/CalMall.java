package workbook.StepG;

import java.util.Scanner;

public class CalMall {
	public int order[] = {0,0,0};
	int sale;
	public int total_order[] = {0,0,0};
	public int total_sale;
	public int price[] = {10000,6000,3000};
	public CalMall(){
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("세 종류의 제품이 있습니다. ");
		System.out.println("(1. 가죽장갑 1만원, 2. 털장갑 6천원, 3. 비닐장갑 3천원) \n");
		while(true){
			System.out.print("1번 제품은 몇개를 구입하실래요? ");
			this.order[0] = s.nextInt();
			System.out.print("2번 제품은 몇개를 구입하실래요? ");
			this.order[1] = s.nextInt();
			System.out.print("3번 제품은 몇개를 구입하실래요? ");
			this.order[2] = s.nextInt();
			
			if(this.order[0]==0&&this.order[1]==0&&this.order[2]==0) break;
			calSale();
			
			
		}
		
	}
	void calSale() {
		sale=0;
		for(int i=0;i<3;i++) {
			sale += this.order[i]*this.price[i];
			this.total_order[i] += this.order[i];
		}
		this.total_sale += sale;
		
		System.out.println("판매금액은 "+sale+"원입니다. \n");
	}
	void printFee() {
		for(int i=0;i<3;i++) {
			System.out.println("\n지금까지의 "+(i+1)+"번상품 판매개수는 "+this.total_order[i]+"개 입니다. ");
		}
		System.out.println("총 매출금액은 "+this.total_sale+"원입니다. ");
	}
}
	
	