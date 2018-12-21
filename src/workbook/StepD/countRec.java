package workbook.stepD;

import java.util.Scanner;

public class countRec {
	private int width;
	private int height;
	private int count1;
	private int count2;
	private int count3;
	private int count4;
	private int count5;
	
	public countRec() {
		input();
	}
	
	public void printRec() {
		System.out.println("\"정사각형\"의 개수는 "+getCount1()+"입니다. ");
		System.out.println("\"좌우로 길쭉한 직사각형\"의 개수는 "+getCount2()+"입니다. ");
		System.out.println("\"위아래로 길쭉한 직사각형\"의 개수는 "+getCount3()+"입니다. ");
		System.out.println("\"일반적인 가로형 직사각형\"의 개수는 "+getCount4()+"입니다. ");
		System.out.println("\"일반적인 세로형 직사각형\"의 개수는 "+getCount5()+"입니다. ");
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		while(true) {
			
			System.out.print("직사각형의 가로 크기와 세로 크기를 입력하시오. : ");
			this.width = s.nextInt();
			this.height = s.nextInt();
			if(this.width<=0||this.height<=0) break;
			
			if(this.width==this.height) {
				this.count1++;
				
			}
			else if(this.width>this.height){
				if(this.width>=2*(this.height)) {
					this.count2++;
				}
				else {
					this.count4++;
				}
			}
			else {
				if(this.height>=2*(this.width)) {
					this.count3++;
				}
				else {
					this.count5++;
				}
			}
		}
		
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
	int getCount5() {
		return this.count5;
	}
		
	

}