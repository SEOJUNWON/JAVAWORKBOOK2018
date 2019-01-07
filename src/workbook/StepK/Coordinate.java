package workbook.StepK;

import java.util.Scanner;

public class Coordinate {
	double x,y;
	int count[]=new int[4];
	public Coordinate() {
		Scanner s =new Scanner(System.in);
		Point pnt = new Point();
		System.out.print("좌표의 X,Y 값을 입력하시오 --> ");
		x=s.nextDouble();
		y=s.nextDouble();
		System.out.println("===================================");
		System.out.println("1번째 좌표는 "+pnt.get_area(x,y)+"사분면에 위치합니다. ");
		count[pnt.get_area(x,y)-1]++;
		print();
		
		
}
	void print() {
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"사분면의 좌표는 모두 "+count[i]+"개입니다. ");
		}
	}
}
class Point{
	
	public int result;
	int get_area(double x, double y) {
		if(x==0||y==0) {
			result=0;
		}
		else if(x>0&&y>0) {
			result=1;
		}
		else if(x<0&&y>0) {
			result=2;
		}
		else if(x<0&&y<0) {
			result=3;
		}
		else if(x>0&&y<0) {
			result=4;
		}
		return result;
	}
	
	
}