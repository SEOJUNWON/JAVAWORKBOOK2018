package workbook.stepA;
import java.util.Scanner;

public class stepA3 {

	private int width;
	private int height;
	private int area;
	
	public stepA3() {
		input();
	}
	
	public void printArea() {
		System.out.println("직사각형의 넓이는 "+getArea()+"입니다. ");
	}
	
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하시오. ");
		this.width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하시오. ");
		this.height = s.nextInt();
	}
	
	int getArea() {
		this.area = width*height;
		return this.area;
	}
		
		
		
	

}