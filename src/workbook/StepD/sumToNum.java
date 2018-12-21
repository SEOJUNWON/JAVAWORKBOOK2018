package workbook.StepD;
import java.util.Scanner;

public class sumToNum {
	private int number;
	private int totalsum;
	private int i;
	
	public sumToNum(){
		input();
		
	}
	
	void printSum() {
		System.out.println("1부터 입력한 숫자까지의 모든 정수를 더한 값은 "+getSum()+" 입니다. ");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. ");
		this.number=s.nextInt();
		
	}
	
	int getSum() {
		this.i=0;
		for(i=1;i<this.number+1;i++) {
			this.totalsum+=i;
		}
		return this.totalsum;
	}
	
}
