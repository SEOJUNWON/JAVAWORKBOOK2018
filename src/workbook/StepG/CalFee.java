package workbook.StepG;

import java.util.Scanner;

public class CalFee {
	public int kind;
	int  money;
	public int charge;
	public int total_Charge;
	public CalFee(){
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("부동산 거래종류(1: 매매, 2:임대, 0:계산종료)를 입력하세요. ");
			this.kind = s.nextInt();
			if(this.kind==0) break; 
			else if(this.kind==1) {
				calFee1();
			}
			else if(this.kind==2) {
				calFee2();
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
			
		}
		
	}
	
	void calFee1() {
		Scanner s = new Scanner(System.in);
		System.out.print("부동산 거래금액(원)을 입력하세요 : ");
		money = s.nextInt();
		if(money<50000000) {
			this.charge = money*6/1000;
			if(this.charge>250000) {
				this.charge=250000;
			}
			printCharge();
			
		}
		else if(money<200000000) {
			charge = money*5/1000;
			if(charge>800000) {
				charge=800000;
			}
			printCharge();
		}
		else {
			charge = money*4/1000;
			printCharge();
		}
	}

	void calFee2() {
		Scanner s = new Scanner(System.in);
		System.out.print("부동산 거래금액(원)을 입력하세요 : ");
		money = s.nextInt();
		if(money<20000000) {
			this.charge = money*5/1000;
			if(charge>70000) {
				charge=70000;
			}
			printCharge();
		}
		else if(money<50000000) {
			charge = money*5/1000;
			if(charge>200000) {
				charge=200000;
			}
			printCharge();
		}
		else if(money<100000000) {
			charge = money*4/1000;
			if(charge>300000) {
				charge=300000;
			}
			printCharge();
		}
		else {
			charge = money*3/1000;
			printCharge();
		}
	}
	void printFee() {
		System.out.println("지금까지의 수수료 총액은 "+this.total_Charge+"원입니다. ");
	}
	
	void printCharge(){
		this.total_Charge+=this.charge;
		System.out.println("이에 대한 중개 수수료는 "+this.charge+"원입니다. ");
	}
}
	
	
