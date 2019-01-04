package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class Slotmachine {
	public int num[] = new int[3];
	public int coins;
	int dummy;
	String onemore;
	
	
	public Slotmachine() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("사용하실 코인의 개수를 입력하세요. ");
		this.coins = s.nextInt();
		int j=1;
		
		for(int i=coins;this.coins>0;i--,j++) {
			System.out.print("게임 "+j+"회 Start!!! (아무숫자나 입력하세요) ");
			dummy=s.nextInt();
			this.coins--;
			makeNum();
			printNum();
			printResult();
			System.out.printf("남아있는 코인은 %d개입니다. \n",this.coins);
		}
		
	}
	
	void makeNum() {
		Random generator = new Random();
		for(int i=0;i<3;i++) {
			this.num[i] = generator.nextInt(8)+1;
		}
	}
	
	void printNum() {
		
		System.out.printf("게임 결과 : %d %d %d ",num[0],num[1],num[2]);
	}
	
	void printResult() {
		if(this.num[0]==this.num[1]) {
			if(this.num[1]==this.num[2]) {
				System.out.println("숫자 3개 일치... 코인 4개 증정");
				this.coins+=4;
			}
			else {
				System.out.println("숫자 2개 일치... 코인 2개 증정");
				this.coins+=2;
			}
		}
		else if(this.num[1]==this.num[2]) {
			if(this.num[0]==this.num[1]) {
				System.out.println("숫자 3개 일치... 코인 4개 증정");
				this.coins+=4;
			}
			else {
				System.out.println("숫자 2개 일치... 코인 2개 증정");
				this.coins+=2;
			}
		}
		else if(this.num[0]==this.num[2]) {
			if(this.num[0]==this.num[1]) {
				System.out.println("숫자 3개 일치... 코인 4개 증정");
				this.coins+=4;
			}
			else {
				System.out.println("숫자 2개 일치... 코인 2개 증정");
				this.coins+=2;
			}
		}
		else {
			System.out.println("꽝입니다... 아쉽군요.. ");
		}
	}
	
}