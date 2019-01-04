package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class HitLotto {
	public int lotto_com[] = new int[6];
	public int lotto_user[] = new int[6];
	public int match_count;
	
	
	public HitLotto() {
		input();
	}
	
	void input() {
		makeNum();
		inputNum();
		checkNum();
	}
	
	void makeNum() {
		Random generator = new Random();
		for(int i=0;i<6;i++) {
			this.lotto_com[i] = generator.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(this.lotto_com[j]==this.lotto_com[i]) {
					i--;
					break;
				}
			}
		}
	}
	void inputNum() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<6;i++) {
			System.out.print("원하는 "+(i+1)+"번째 로또 숫자를 입력하세요. ");
			this.lotto_user[i] = s.nextInt();
			for(int j=0;j<i;j++) {
				if(this.lotto_user[j]==this.lotto_user[i]) {
					i--;
					System.out.println("=> 잘못입력하셨습니다. ");
					break;
				}
				else if(this.lotto_user[i]>45||this.lotto_user[i]<1) {
					i--;
					System.out.println("=> 잘못입력하셨습니다. ");
					break;
				}
			}
		}
	}
	void checkNum() {
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(this.lotto_user[j]==this.lotto_com[i]) {
					this.match_count++;
					break;
				}
			}
		}
	}
	void printNum() {
		System.out.printf("\n이번 주의 로또 당첨 번호는 %d %d %d %d %d %d 입니다. \n\n",lotto_com[0],lotto_com[1],lotto_com[2],lotto_com[3],lotto_com[4],lotto_com[5]);
		System.out.printf("일치하는 로또 번호는 %d개 입니다. \n",this.match_count);
	}
}