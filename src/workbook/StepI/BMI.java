package workbook.StepI;

import java.util.Scanner;

public class BMI {
	private double bmi;
	private int count;
	private int weight,height;
	
	
	public BMI() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+"번째 사람의 신장(cm)과 체중(kg)을 입력하시오. ");
			height=s.nextInt();
			weight=s.nextInt();
			AskBiman(height,weight);
		}
	}
	void AskBiman(int height,int weight) {
		double BMI = (double)weight/(((double)height*0.01)*((double)height*0.01));
	
		if(BMI<18.5) {
			System.out.println("저체중입니다.");
		}
		else if(BMI<23) {
			System.out.println("정상체중 입니다.");
		}
		else if(BMI<25) {
			System.out.println("과체중 입니다.");
		}
		else if(BMI<30) {
			System.out.println("경도 비만입니다.");
		}
		else {
			System.out.println("고도 비만입니다.");
		}
		
	}
	

}