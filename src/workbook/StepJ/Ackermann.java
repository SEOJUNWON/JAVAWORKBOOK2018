package workbook.StepJ;


public class Ackermann {
	public int i=0;
	public int a[]=new int[16];
	public Ackermann() {
		input();
	}
	
	void input() {
		for(int k=0;k<4;k++ ) {
			for(int l=0;l<4;l++) {
				a[k*4+l]=Ackermann(k,l);
				System.out.println("Ackermann("+k+", "+l+") = "+this.a[k*4+l]);
			}
			
		}
		
	}
	
	int Ackermann(int i,int j) {
		int result=0;
		if(i==0&&j>=0) {
			result=j+1;
		}
		else if(i>0&&j==0) {
			result=Ackermann(i-1,1);
		}
		else if(i>0&&j>0) {
			result=Ackermann(i-1,Ackermann(i,j-1));
		}
		return result;
		
	}
}