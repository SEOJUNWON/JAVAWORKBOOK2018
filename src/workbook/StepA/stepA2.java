package workbook.stepA;
import java.util.Scanner;

public class stepA2 {

		private double c_degree;
		private double f_degree;
		
		public stepA2() {
			input();
		}
		
		public void printDegree() {
			System.out.println("화씨 온도는 "+getDegree()+" 도 입니다. ");
		}
		
		void input() {
			Scanner s = new Scanner(System.in);
			System.out.print("섭씨 온도를 입력하시오. ");
			this.c_degree = s.nextDouble();
		}
		
		double getDegree() {
			this.f_degree = c_degree*1.8+32;
			return this.f_degree;
		}
		
		

	

}
	