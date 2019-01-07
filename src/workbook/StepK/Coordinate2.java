package workbook.StepK;

import java.util.Scanner;

public class Coordinate2 {
	double x,y;
	int how_many;
	public int count[]=new int[4];

public Coordinate2() {
	Scanner s = new Scanner(System.in);
	System.out.print("몇 개의 좌표를 입력하겠습니까?  : ");
	how_many=s.nextInt();
	Point pnt[]=new Point[how_many];
	int area[]=new int[how_many];
			
	for(int i=0;i<how_many;i++) {
		pnt[i] = new Point();
		System.out.print((i+1)+"번째 좌표의 X, Y 값을 입력하시오 --> ");
		x=s.nextDouble();
		y=s.nextDouble();
		area[i]=pnt[i].get_area(x,y);
		get_count(area[i]);
	}
	System.out.println("========================================================");
	for(int i=0;i<how_many;i++) {
		System.out.println((i+1)+"번째 좌표는 "+area[i]+"사분면에 위치합니다.");
	}
		print();

}
void get_count(int area) {
	if(area==1) {
		this.count[0]++;
	}
	else if(area==2) {
		this.count[1]++;
	}
	else if(area==3) {
		this.count[2]++;
	}
	else if(area==4) {
		this.count[3]++;
	}
}
void print() {
	for(int i=0;i<4;i++) {
		System.out.println((i+1)+"사분면의 좌표는 모두 "+this.count[i]+"개입니다. ");
	}
}
}
