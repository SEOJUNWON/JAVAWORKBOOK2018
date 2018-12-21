package workbook.StepA;
import java.util.Scanner;

public class stepA4 {
	private double pyung_area;
	private double m2_area;
	
	public stepA4() {
		input();
	}
	
	public void printArea() {
		System.out.printf("아파트의 평형은 %.1f 입니다. \n",getArea());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양 면적을 입력하시오. ");
		this.m2_area = s.nextDouble();
	}
	
	double getArea() {
		this.pyung_area = m2_area/3.305;
		return this.pyung_area;
	}
		
		
		
		

	

}
