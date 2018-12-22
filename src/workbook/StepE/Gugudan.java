package workbook.stepE;
import java.util.Scanner;


	public class Gugudan {
		private int mode;
		private int i,j;
		
		public Gugudan() {
			input();
		}
		
		void input() {
			Scanner s = new Scanner(System.in);
			System.out.print("구구단의 출력모드(1: 홀수단, 2: 짝수단)를 입력하시오. ");
			this.mode=s.nextInt();
			if(this.mode==1) {
				getOdd();
			}
			else if(this.mode==2) {
				getEven();
			}
				
			
		}
		
		void getOdd() {
			for(i=1;i<=4;i++) {
				for(j=1;j<10;j++) {
					System.out.print(2*i+1+" X "+j+" = "+(2*i+1)*j+"\t");
					if(j%3==0) {
						System.out.print("\n");
					}
				}
				System.out.print("\n");
			}
		}
		void getEven() {
			for(i=1;i<=4;i++) {
				for(j=1;j<10;j++) {
					System.out.print(2*i+" X "+j+" = "+(2*i)*j+"\t");
					if(j%3==0) {
						System.out.print("\n");
					}
				}
				System.out.print("\n");
		}
		}
}
