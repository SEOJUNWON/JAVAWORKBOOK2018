package workbook.stepD;

import java.util.Scanner;

public class countApt {
	private double m2_area; 
	private double pyung_area;
	private int count1;
	private int count2;
	private int count3; 
	private int count4;
	private int i;
	
	public countApt() {
		input();
	}
	
	public void printApt() {
		System.out.println("\"소형 아파트\"의 개수는 "+getCount1()+" 입니다.");
		System.out.println("\"중소형 아파트\"의 개수는 "+getCount2()+" 입니다.");
		System.out.println("\"중형 아파트\"의 개수는 "+getCount3()+" 입니다.");
		System.out.println("\"대형 아파트\"의 개수는 "+getCount4()+" 입니다.");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(i=0;i<10;i++) {
			System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오. ");
			this.m2_area = s.nextDouble();
			printArea();
			if(getArea()<15) {
				this.count1++;
			}
			else if(getArea()<30) {
				this.count2++;
			}
			else if(getArea()<50) {
				this.count3++;
			}
			else {
				this.count4++;
			}
		}
		
	}
	
	double getArea() {
		this.pyung_area = m2_area/3.305;
		return this.pyung_area;
	}
	void printArea() {
		System.out.printf("--> 이 아파트의 평형은 %.1f 입니다. \n",getArea());
	}
	int getCount1() {
		return this.count1;
	}
	int getCount2() {
		return this.count2;
	}
	int getCount3() {
		return this.count3;
	}
	int getCount4() {
		return this.count4;
	}
	

}