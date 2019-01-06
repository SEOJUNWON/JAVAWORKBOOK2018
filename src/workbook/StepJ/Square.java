package workbook.StepJ;
import java.util.*;

public class Square {
	int input;
	public Square() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하시오. (0.종료) : ");
			input=s.nextInt();
			if(input==0) break;
			System.out.println("2의 "+input+"승은 : "+poweroftwo(input));
		}
		
	}
	
	int poweroftwo(int n) {
		int result=0;
		
		if(n==0) {
			result=1;
			
		}
		else if(n>0) {
			result=2*poweroftwo(n-1);
		}
		return result;
		
	}
}
