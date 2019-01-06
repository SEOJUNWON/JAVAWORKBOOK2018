package workbook.StepJ;

import java.util.Scanner;

public class CalFee {
	int start_hour[]=new int [999];
	int charge;
	int start_minute[]=new int [999];;
	int end_hour[]=new int [999];;
	int end_minute[]=new int [999];;
	public int total_fee=0;
	public int i;
	String Y_N;
	public CalFee(){
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(this.i=0;;this.i++){
			System.out.print((this.i+1)+"번 차량 주차 시작 시각 (시 분) : ");
			start_hour[i] = s.nextInt();
			start_minute[i] = s.nextInt();
			System.out.print((this.i+1)+"번 차량 주차 종료 시각 (시 분) : ");
			end_hour[i] = s.nextInt();
			end_minute[i] = s.nextInt();
			
			charge=CalcParking(start_hour[i],start_minute[i],end_hour[i],end_minute[i]);
			this.total_fee+=charge;
			System.out.println("주차요금 : "+charge+"원");
			System.out.print("더 입력하시겠습니까?(Y/N) ");
			Y_N=s.next();
			if(Y_N.equalsIgnoreCase("N")) break; 
		}
		
	}
	
	int CalcParking(int start_h, int start_m, int end_h, int end_m ) {
		int minute1 = start_h*60+start_m;
		int minute2 = end_h*60+end_m;
		int charge=0;
		int total_minute = minute2-minute1;
		
		if(total_minute%10==0) {
			charge=(total_minute/10)*500;
		}
		else {
			charge=(total_minute/10)*500+500;
		}
		return charge;
	}

	
	void printFee() {
		System.out.println("주차차량 "+(this.i+1)+"대의 총 주차 요금은 "+this.total_fee+"원입니다. ");
	}
}
	
	
		