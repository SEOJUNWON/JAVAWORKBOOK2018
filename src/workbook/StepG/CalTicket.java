package workbook.StepG;

import java.util.Scanner;

public class CalTicket {
	public int charge[] = {5000,10000,15000,3000};
	int team_count;
	public int count[] = new int[4];
	public int v_count[] = new int[4];
	public int total_count = 0;
	public int sum, total_sum;
	public int membership = 0;
	
	public CalTicket(){
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("오늘 방문한 팀 수를 입력하세요. ");
		team_count = s.nextInt();
		
		for(int i=0;i<team_count;i++){
			System.out.print((i+1)+"번팀 인원수(초등학생, 청소년, 일반 경로대상)를 입력하세요. ");
			for(int j=0;j<4;j++) {
				this.count[j]=s.nextInt();
			}
			
			System.out.print((i+1)+"번팀 할인카드 종류(카드없음:0, 일반등급 : 1, VIP등급 : 2)를 입력하세요. ");
			this.membership = s.nextInt();
			
			System.out.println((i+1)+"번팀 입장료는 "+getTicket()+"원입니다. ");
			
			
		}
		
	}
	int getTicket() {
		sum=0;
		for(int i=0;i<4;i++) {
			sum += this.count[i]*this.charge[i];
			this.v_count[i] += this.count[i];
			this.total_count += this.count[i];
		}
		if(this.membership==1) {
			sum=sum-sum*10/100;
		}
		else if(this.membership==2) {
			sum=sum-sum*20/100;
		}
		this.total_sum += sum; 
		return sum;
	}
	void printFee() {
		System.out.println("\n오늘 총 방문자 수는 "+this.total_count+"명입니다. ");
		System.out.println("초등학생 수는 "+this.v_count[0]+"명입니다. ");
		System.out.println("청소년 수는 "+this.v_count[1]+"명입니다. ");
		System.out.println("일반인 수는 "+this.v_count[2]+"명입니다. ");
		System.out.println("경로대상 수는 "+this.v_count[3]+"명입니다. ");
		System.out.println("\n총 입장료는 "+this.total_sum+"원입니다. ");
		
	}
}
	