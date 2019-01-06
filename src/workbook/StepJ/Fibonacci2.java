package workbook.StepJ;

public class Fibonacci2 {
	public int i=0;
	double ratio;
	double b_ratio;
	public int result[]=new int[20];
	public Fibonacci2() {
		input();
	}
	
	void input() {
		fibonacci(20);
		for(int j=0;j<20;j++){
			if(j!=0) b_ratio = Double.parseDouble(String.format("%.6f",(double)this.result[j]/(double)this.result[j-1]));
			
			ratio=Double.parseDouble(String.format("%.6f",(double)this.result[j+1]/(double)this.result[j]));
			System.out.printf("%2d번째 비율 (%d / %d) : %f\n",j+1,this.result[j+1],this.result[j],ratio);
			if(ratio==b_ratio) break;
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
