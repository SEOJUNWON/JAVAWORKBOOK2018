package workbook.StepJ;

public class Fibonacci1 {
	public int i=0;
	public int result[]=new int[20];
	public Fibonacci1() {
		input();
	}
	
	void input() {
		System.out.println("1부터 20까지 피보나치 수는 다음과 같습니다. ");
		fibonacci(20);
		for(int j=0;j<20;j++){
			System.out.printf("%2d번째 : %d\n",j+1,this.result[j]);
		}
	}
	
	int fibonacci(int n) {
		if(n==1||n==2) {
			this.result[n-1]=1;
			
		}
		else if(n>2) {
			this.result[n-1]=fibonacci(n-1)+fibonacci(n-2);
		}
		return this.result[n-1];
		
	}
}
