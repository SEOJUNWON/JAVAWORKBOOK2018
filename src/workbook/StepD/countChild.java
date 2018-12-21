package workbook.stepD;

import java.util.Scanner;

public class countChild {
	private int count_all;
	private int count_young;
	private int i;
	private int birth_year;
	private int age;
	
	public countChild(){
		input();
		
	}
	
	void printChild() {
		System.out.println("가족들 중에 미성년자는 모두 "+this.count_young+"명입니다. ");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("가족이 몇 명인지 입력하세요. ");
		this.count_all=s.nextInt();
		for(i=0;i<this.count_all;i++) {
			System.out.print("태어난 년도를 입력하세요 ");
			this.birth_year=s.nextInt();
			if(getAge()<20) {
				this.count_young++;
			}
		}
		
	}
	
	int getAge() {
		this.age=2014-this.birth_year+1;
		return this.age;
	}
		
}
