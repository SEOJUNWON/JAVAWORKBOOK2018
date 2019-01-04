package workbook.StepH;
import java.util.*;

public class PrintString {
	public String input;
	
	
	public PrintString() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("========================================");
			System.out.print("=> 문자열을 입력하세요 (x: 종료) : ");
			
			this.input = s.nextLine();
			if(this.input.equalsIgnoreCase("X"))break;
			howMany();
			getOne();
		}
	}
	
	void howMany(){
		System.out.println("=> 총 문자의 개수는 "+this.input.length()+"개입니다. ");
	}
	void getOne() {
		for(int i=0;i<this.input.length();i++) {
			System.out.println("=> "+this.input.charAt(i));
		}
		System.out.print("\n");
	}
	void fin() {
		System.out.println("* 종료되었습니다. ");
	}
	
}
