package workbook.StepH;
import java.util.*;

public class QuizNum {
	public int answer;
	public int number_try;
	public int count;
	public boolean check=false;
	
	
	public QuizNum() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		Random generator = new Random();
		this.answer = generator.nextInt(100)+1;
		while(true) {
			System.out.print("1부터 100까지의 숫자 하나를 맞춰보세요 ");
			this.number_try = s.nextInt();
			checkAnswer();
			if(check) break;
		}
		
	}
	
	void checkAnswer() {
		if(this.answer==this.number_try) {
			this.check = true;
			this.count++;
		}
		else if(this.answer<this.number_try) {
			System.out.println("좀 더 작은 수입니다. ");
			this.count++;
		}
		else{
			System.out.println("좀 더 큰 수입니다. ");
			this.count++;
		}
	}
	void printAnswer() {
		System.out.println(this.count+" 번만에 숫자를 맞추셨습니다. ");
	}
}
