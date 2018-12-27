package workbook.StepG;
import java.util.Scanner;

public class CalAge {
	public int birth_year;
	public int age[] = new int[100];
	public int count_person, count_baby, count_child; 
	public int count_youth, count_young, count_adult;
	public int count_old;
	public int i;
	
	public CalAge(){
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(this.i=0;this.i<100;this.i++) {
			System.out.print((this.i+1)+"번째 사람의 태어난 년도를 입력하시오.  ");
			this.birth_year = s.nextInt();
			if(this.birth_year>2012) break;
			this.count_person++;
			this.age[this.i]=2012-this.birth_year+1;
			getAge();
			
		}
		
	}
	
	void getAge() {
		if(this.age[this.i]<7) {
			this.count_baby++;
		}
		else if(this.age[this.i]<13) {
			this.count_child++;
		}
		else if(this.age[this.i]<20) {
			this.count_youth++;
		}
		else if(this.age[this.i]<30) {
			this.count_young++;
		}
		else if(this.age[this.i]<60) {
			this.count_adult++;
		}
		else {
			this.count_old++;
		}
	}
	
	void printAge() {
		for(int j=0;j<this.i;j++) {
			System.out.println((j+1)+"번째 사람의 나이는 "+this.age[j]+" 입니다. ");
		}
		System.out.println("유아는 "+count_baby+"명 입니다. ");
		System.out.println("어린이는 "+count_child+"명 입니다. ");
		System.out.println("청소년은 "+count_youth+"명 입니다. ");
		System.out.println("청년은 "+count_young+"명 입니다. ");
		System.out.println("중년은 "+count_adult+"명 입니다. ");
		System.out.println("노년은 "+count_old+"명 입니다. ");
	}
}
