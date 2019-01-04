package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class RSPgame {
	public int com_finger;
	public int my_finger;
	public int score[][] = new int[2][3];
	
	
	public RSPgame() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		Random generator = new Random();
		while(true) {
			this.com_finger = generator.nextInt(3)+1;
			System.out.print("가위(1), 바위(2), 보(3)를 입력하세요. ");
			this.my_finger = s.nextInt();
			if(this.my_finger==0) break;
			check();
		}
		
	}
	
	
	void check() {
		if(this.com_finger==this.my_finger) {
			score[0][1]++;
			score[1][1]++;
			checkCom();
			System.out.println("비김~! \n");
		}
		else if(this.com_finger==1) {
			if(this.my_finger==2) {
				score[0][2]++;
				score[1][0]++;
				checkCom();
				System.out.println("사용자 승! \n");
			}
			else if(this.my_finger==3) {
				score[0][0]++;
				score[1][2]++;
				checkCom();
				System.out.println("컴퓨터 승! \n");
			}
		}
		else if(this.com_finger==2) {
			if(this.my_finger==3) {
				score[0][2]++;
				score[1][0]++;
				checkCom();
				System.out.println("사용자 승! \n");
			}
			else if(this.my_finger==1) {
				score[0][0]++;
				score[1][2]++;
				checkCom();
				System.out.println("컴퓨터 승! \n");
			}
		}
		else if(this.com_finger==3) {
			if(this.my_finger==1) {
				score[0][2]++;
				score[1][0]++;
				checkCom();
				System.out.println("사용자 승! \n");
			}
			else if(this.my_finger==2) {
				score[0][0]++;
				score[1][2]++;
				checkCom();
				System.out.println("컴퓨터 승! \n");
			}
		}
	}
	void checkCom() {
		if(this.com_finger==1) {
			System.out.print("컴퓨터가 낸 것은 가위입니다. -----> ");
		}
		else if(this.com_finger==2) {
			System.out.print("컴퓨터가 낸 것은 바입니다. -----> ");
		}
		else if(this.com_finger==3) {
			System.out.print("컴퓨터가 낸 것은 보입니다. -----> ");
		}
	}
	void printResult() {
		System.out.printf("\n컴퓨터 : 이긴 횟수는 %d회, 진 횟수 %d회, 비긴 횟수는 %d 입니다. \n",score[0][0],score[0][1],score[0][2]);
		System.out.printf("사용자 : 이긴 횟수는 %d회, 진 횟수 %d회, 비긴 횟수는 %d 입니다. \n",score[1][0],score[1][1],score[1][2]);
	}
}