package workbook.StepC;

import java.util.Scanner;

public class stepC2 {
	private double input_degree;
	
	public stepC2() {
		input();
	}
	
	public void printDegree() {
		if(getDegree()<0) {
			System.out.println("잘못입력하셨습니다.");
		}else if(getDegree()<25) {
			System.out.println("냉수입니다. ");
		}else if(getDegree()<40) {
			System.out.println("미온수입니다.");
		}else if(getDegree()<80) {
			System.out.println("온수입니다.");
		}else{
			System.out.println("끓는 물입니다.");
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("물의 온도를 입력하세요. ");
		this.input_degree = s.nextDouble();
	}
	
	double getDegree() {
		return this.input_degree;
	}
	
	



}

