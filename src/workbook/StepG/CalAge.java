package workbook.StepG;
import java.util.Scanner;

public class CalAge {
	public int birth_year;
	public int age[] = new int[100];
	public int count[]=new int[7];
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
			this.count[0]++;
			this.age[this.i]=2012-this.birth_year+1;
			getAge();
			
		}
		
	}
	
	void getAge() {
		if(this.age[this.i]<7) {
			this.count[1]++;
		}
		else if(this.age[this.i]<13) {
			this.count[2]++;
		}
		else if(this.age[this.i]<20) {
			this.count[3]++;
		}
		else if(this.age[this.i]<30) {
			this.count[4]++;
		}
		else if(this.age[this.i]<60) {
			this.count[5]++;
		}
		else {
			this.count[6]++;
		}
	}
	
	void printAge() {
		for(int j=0;j<this.i;j++) {
			System.out.println((j+1)+"번째 사람의 나이는 "+this.age[j]+" 입니다. ");
		}
		for(int j=0;j<6;j++) {
			if(j>1)System.out.println(a[j]+"은 "+count[j+1]+"명 입니다. ");
			else System.out.println(a[j]+"는 "+count[j+1]+"명 입니다. ");
		}
	}
}
