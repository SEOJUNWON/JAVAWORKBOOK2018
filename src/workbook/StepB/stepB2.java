package workbook.StepB;
import java.util.Scanner;

public class stepB2 {
	private double input_degree;
	private double output_degree;
	private String kind;
	
	public stepB2() {
		input();
	}
	
	public void printDegree() {
		System.out.println("변환된 온도는 "+getDegree()+" 도 입니다. ");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("온도를 입력하시오. ");
		this.input_degree = s.nextDouble();
		System.out.print("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요. ");
		this.kind = s.next();
	}
	
	double getDegree() {
		if(this.kind.equals("C")||this.kind.equals("c")) {
			this.output_degree = this.input_degree*1.8+32;
		}
		else if(kind.equals("F")||kind.equals("f")) {
			this.output_degree = (this.input_degree-32)/1.8;
		}
		return this.output_degree;
	}
		
		
		
	

}
