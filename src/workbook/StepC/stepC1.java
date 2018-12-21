package workbook.stepC;

import java.util.Scanner;

public class stepC1 {
	private int birth_year;
	private int age;
	
	public stepC1() {
		input();
	}
	
	public void printAge() {
		if(getAge()<7) {
			System.out.println("유아입니다. ");
		}
		else if(getAge()<13) {
			System.out.println("어린이입니다. ");
		}
		else if(getAge()<20) {
			System.out.println("청소년입니다. ");
		}
		else if(getAge()<30) {
			System.out.println("청년입니다. ");
		}
		else if(getAge()<60) {
			System.out.println("중년입니다. ");
		}
		else {
			System.out.println("노년입니다. ");
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하시오. ");
		this.birth_year = s.nextInt();
	}
	
	int getAge() {
		this.age = 2012-birth_year+1;
		return this.age;
	}
	
	


		

	

}
