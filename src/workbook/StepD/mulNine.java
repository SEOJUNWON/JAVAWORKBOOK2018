package workbook.StepD;
import java.util.Scanner;

public class mulNine {
	private int dan;
	private int i;
	
	public mulNine() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("출력하고 싶은 구구단의 단 수를 입력하시오(2~9). ");
			this.dan=s.nextInt();
			if(this.dan<2||this.dan>9) {
				System.out.println("잘못 입력하였습니다.");
			}
			else {
				printMul();
				break;
			}
		}
	}
	
	void printMul() {
		for(i=1;i<10;i++) {
			System.out.println(this.dan+" X "+this.i+" = "+(this.dan*this.i));
		}
		
	}

}
