package workbook.StepJ;

import java.util.Scanner;

public class PowMethod {
	int input,input2;
	public PowMethod() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
			System.out.print("숫자 2개를 입력하시오. ");
			input=s.nextInt();
			input2=s.nextInt();
			System.out.println(input+"의 "+input2+"승은 : "+power(input,input2)+" 입니다. ");
		
		
	}
	
	int power(int num1,int num2) {
		int result=0;
		
		if(num2==0) {
			result=1;
		}
		else if(num2==1) {
			result=num1;
		}
		else if(num2>1&&(num2%2==0)) {
			result=power(num1,num2/2)*power(num1,num2/2);
		}
		else if(num2>1&&(num2%2==1)) {
			result=power(num1,num2/2)*power(num1,num2/2)*num1;
		}
		return result;
		
	}
}