package workbook.StepG;

import java.util.Scanner;

public class PCFee {
	public int hour;
	public int charge;
	public int minute;
	public int total_Charge=0;
	public PCFee(){
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("사용한 시간을 시간과 분으로 입력하세요 : ");
			this.hour = s.nextInt();
			this.minute = s.nextInt();
			if(this.hour==0&&this.minute==0) break; 
			CalFee();
			System.out.println("고객님의 이용료는 "+getFee()+"원입니다. ");
		}
		
	}
	
	void CalFee() {
		this.charge = this.hour*2000;
		if(this.minute>30) {
			this.charge += 2000;
		}
		else if(this.minute <= 0){
			
		}
		else {
			this.charge += 1000;
		}
	}
	int getFee() {
		
		if(this.hour == 2) {
			this.charge = this.charge-this.charge*5/100;
		}
		else if(this.hour>2&&this.hour<5) {
			this.charge = this.charge-this.charge*10/100;
		}
		else if(this.hour>=5){
			this.charge = this.charge-this.charge*20/100;
		}
		this.total_Charge += this.charge;
		return this.charge;
	}

	
	void printFee() {
		System.out.println("\n지금까지의 이용료 총금액은 "+this.total_Charge+"원입니다. ");
	}
}
	
	
		

