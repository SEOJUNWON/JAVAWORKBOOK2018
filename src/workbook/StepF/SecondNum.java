package workbook.stepF;
import java.util.Scanner;

public class SecondNum {
	
	private int num[]= new int[10];
	private int first=-999999999;
	private int second=-999999999;
	private int second_max_index;
	private int first_max_index=0;
	
	public SecondNum() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+"번째 수를 입력하시오. ");
			num[i]=s.nextInt();
			if(num[i]>this.second) {
				if(num[i]>this.first) {
					this.second=this.first;
					this.second_max_index=this.first_max_index;
					this.first=num[i];
					this.first_max_index=i+1;
					
					
				}
				else {
					this.second=num[i];
					this.second_max_index=i+1;
				}
				
			}
		}
		
	}
	
	void printSecond() {
		System.out.println("두 번째로 큰 수는 "+(this.second_max_index)+"번째 수 "+this.second+"입니다. ");
	}

}
