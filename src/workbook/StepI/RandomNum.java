package workbook.StepI;

import java.util.*;

public class RandomNum {
	public int random;
	public int count[]= {0,0,0};
	private int weight,height;
	byte type;
	
	public RandomNum() {
		input();
	}
	
	void input() {
		Random generator = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("10개의 숫자를 생성합니다.  ");
		for(int i=0;i<10;i++) {
			this.random = generator.nextInt(99)+1;
			System.out.println("생성된 임의의 숫자는 "+this.random+"입니다. ");
			
			this.count[GetRandom()]++;
					
		}
	}
	
	byte GetRandom() {
		if(this.random<40) return 2;
		else if(this.random<70) return 1;
		else return 0;
	}
	void printResult(){
		System.out.println("\n1. 대 (70 이상) : "+this.count[0]+"회 생성 ");
		System.out.println("2. 중 (40 이상) : "+this.count[1]+"회 생성 ");
		System.out.println("3. 소 (40 미만) : "+this.count[2]+"회 생성 ");
	}
	

}