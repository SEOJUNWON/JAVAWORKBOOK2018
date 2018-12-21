package workbook.StepA;
import java.util.Scanner;

public class stepA7 {
	private double gigabytes;
	private double megabytes;
	private double kilobytes;
	private long bytes;
	
	public stepA7() {
		input();
	}
	
	public void printBytes() {
		System.out.println("입력하신 파일 용량은");
		System.out.println((long)getMega()+" 메가바이트, ");
		System.out.println((long)getKilo()+" 킬로바이트, ");
		System.out.println(getBytes()+" 바이트 입니다. ");
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("파일 용량을 기가바이트 단위로 입력하세요. ");
		this.gigabytes=s.nextInt();
		this.megabytes=gigabytes*1024;
		this.kilobytes=megabytes*1024;
		this.bytes=(long)kilobytes*1024;
	}
	
	double getMega() {
		return this.megabytes;
	}
	double getKilo() {
		return this.kilobytes;
	}
	long getBytes() {
		return this.bytes;
	}
		
		
		
		
		
	

}
