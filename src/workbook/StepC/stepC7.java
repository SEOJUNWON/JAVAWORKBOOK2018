package workbook.StepC;

import java.util.Scanner;

public class stepC7 {
	private int megabytes;
	private long bytes;
	private byte kind;
	private double time;
	
	public stepC7() {
		input();
	}
	
	public void printBytes() {
		if(kind==1) {
			System.out.printf("파일 전송 시간은 %.1f 초입니다. \n",getWifi());
		}
		else if(kind==2) {
			System.out.printf("파일 전송 시간은 %.1f 초입니다. \n",getBluetooth());
		}
		else if(kind==3) {
			System.out.printf("파일 전송 시간은 %.1f 초입니다. \n",getLte());
		}
		else if(kind==4) {
			System.out.printf("파일 전송 시간은 %.1f 초입니다. \n",getUsb());
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	void input() {
		Scanner s= new Scanner(System.in);
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요. ");
		this.megabytes=s.nextInt();
		this.bytes=(long)megabytes*1024*1024;
		System.out.print("전송방식을 1: Wi-Fi, 2: BlueTooth, 3: LTE, 4: USB 에서 선택하여 입력하세요. ");
		this.kind=s.nextByte();
	}
	
	
	double getWifi() {
		this.time=(double)this.bytes/1500000;
		return this.time;
	}
	double getBluetooth() {
		this.time=(double)this.bytes/300000;
		return this.time;
	}
	double getLte() {
		this.time=(double)this.bytes/1000000;
		return this.time;
	}
	double getUsb() {
		this.time=(double)this.bytes/60000000;
		return this.time;
	}
		
		
		
		
		
}
