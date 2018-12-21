package workbook.stepA;
import java.util.Scanner;

public class stepA1 {

		private int birth_year;
		private int age;
		
		public stepA1() {
			input();
		}
		
		public void printAge() {
			System.out.println("당신의 나이는 "+ getAge() +"살 입니다.");
		}
		
		void input() {
			Scanner s = new Scanner(System.in);
			System.out.print("태어난 년도를 입력하시오. ");
			this.birth_year = s.nextInt();
		}
		
		int getAge() {
			this.age = 2014-birth_year+1;
			return this.age;
		}
		
		

	

}
