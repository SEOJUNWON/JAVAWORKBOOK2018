package workbook.StepB;

import java.util.Scanner;

public class stepB9 {
	private int weight;
	private int height;
	private int bmi;
	
	public stepB9() {
		input();
	}
	
	public void printBmi() {
		if(getBmi()>=25) {
			System.out.println("당신은 비만이십니다. ");
		}else {
			System.out.println("당신은 비만이 아니군요. ");
		}
		
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("신장(cm단위)을 입력하세요. ");
		this.height = s.nextInt();
		System.out.print("체중(kg단위)를 입력하세요. ");
		this.weight = s.nextInt();
	}
	
	int getBmi() {
		double bmi2 = (double)this.weight/(((float)this.height/100.0)*((float)this.height/100.0));
		this.bmi=(int)bmi2;
		return this.bmi;
	}
		
		
		
	
}
