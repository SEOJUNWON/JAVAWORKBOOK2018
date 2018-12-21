package workbook.StepB;

import java.util.Scanner;

public class stepB7 {
	private int megabytes;
	private long bytes;
	private String usb2;
	private int time;
	
	public stepB7() {
		input();
	}
	
	public void printBytes() {
		if(this.usb2.equals("Y")||this.usb2.equals("y")) {
			System.out.println("파일 전송 시간은 "+getUsb2()+" 초입니다. ");
		}else if(this.usb2.equals("N")||this.usb2.equals("n")) {
			System.out.println("파일 전송 시간은 "+getUsb1()+" 초입니다. ");
		}
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요. ");
		this.megabytes=s.nextInt();
		this.bytes=(long)megabytes*1024*1024;
		System.out.print("USB포트가 2.0이면 Y, 아니면 N을 입력하세요. ");
		this.usb2=s.next();
	}
	
	
	int getUsb1() {
		this.time=(int)this.bytes/1500000;
		return this.time;
	}
	int getUsb2() {
		this.time=(int)this.bytes/60000000;
		return this.time;
	}
		
		
		
		
		
}
