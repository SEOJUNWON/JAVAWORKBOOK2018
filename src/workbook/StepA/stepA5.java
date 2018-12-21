package workbook.StepA;
import java.util.Scanner;

public class stepA5 {
	private int days;
	private int seconds;
	
	public stepA5() {
		input();
	}
	
	public void printSeconds() {
		System.out.println("날 수에 해당되는 시간은 모두 "+(long)getSeconds()+" 초입니다.");
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("날 수를 입력하세요. ");
		this.days=s.nextInt();
	}
	
	double getSeconds() {
		this.seconds=days*24*60*60;
		return this.seconds;
	}
		
		
		
	

}
