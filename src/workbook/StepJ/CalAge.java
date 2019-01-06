package workbook.StepJ;

import java.util.Scanner;

public class CalAge {
	public int birth_year;
	public int age;
	public int count[]=new int[6];
	public int i;
	String a[]= {"유아","어린이","청소년","청년","중년","노년"};
	
	public CalAge(){
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(this.i=0;this.i<100;this.i++) {
			System.out.print((this.i+1)+"번째 사람의 태어난 년도를 입력하시오.  ");
			this.birth_year = s.nextInt();
			if(this.birth_year>2012) break;
			this.count[AskAge(birth_year)]++;
			
		}
		
	}
	int AskAge(int birth) {
		this.age=2014-this.birth_year+1;
		System.out.println("나이는 "+this.age+" 입니다. ");
		if(this.age<7) {
			return 0;
		}
		else if(this.age<13) {
			return 1;
		}
		else if(this.age<20) {
			return 2;
		}
		else if(this.age<30) {
			return 3;
		}
		else if(this.age<60) {
			return 4;
		}
		else {
			return 5;
		}
		
	}
	
	void printAge() {
		for(int j=0;j<6;j++) {
			if(j>1)System.out.println(a[j]+"은 "+count[j]+"명 입니다. ");
			else System.out.println(a[j]+"는 "+count[j]+"명 입니다. ");
		}
	}
}
