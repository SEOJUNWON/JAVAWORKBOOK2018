package workbook.StepH;

import java.util.*;

public class Lotto {
	public int lotto[] = new int[6];
	String onemore;
	
	
	public Lotto() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			makeNum();
			printNum();
			System.out.print("더 만드시겠습니까? (Y/N) ");
			this.onemore = s.next();
			if(onemore.equalsIgnoreCase("N")) break;
			
			
		}
		
	}
	
	void makeNum() {
		Random generator = new Random();
		for(int i=0;i<6;i++) {
			this.lotto[i] = generator.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(this.lotto[j]==this.lotto[i]) {
					i--;
					break;
				}
			}
		}
	}
	
	void printNum() {
		System.out.printf("생성된 로또 번호는 %d %d %d %d %d %d 입니다. \n",lotto[0],lotto[1],lotto[2],lotto[3],lotto[4],lotto[5]);
	}
}