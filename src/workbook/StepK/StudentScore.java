package workbook.StepK;

import java.util.Scanner;

public class StudentScore {

	int how_many;
	
	public StudentScore() {
		Scanner s = new Scanner(System.in);
		System.out.print("등록할 학생의 명수는? ");
		how_many=s.nextInt();
		Student user[]=new Student[how_many];
		
		for(int i=0;i<how_many;i++) {
			System.out.print((i+1)+"번 ");
			user[i]=new Student();
			user[i].input();
		}
		System.out.println("===============================");
		System.out.println("등록된 학생 목록은 다음과 같습니다. ");
		System.out.println("-------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		for(int i=0;i<how_many;i++) {
			System.out.print((i+1));
			user[i].print();
		}
		
	}
}
class Student{
	public int kor;
	public int eng;
	public int math;
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("학생의 국어, 영어, 수학점수를 입력하시오 --> ");
		this.kor=s.nextInt();
		this.eng=s.nextInt();
		this.math=s.nextInt();
		
		
	}
	void print() {
		int total=this.kor+this.eng+this.math;
		double average=(double)total/3.0;
		System.out.println("\t"+this.kor+"\t"+this.eng+"\t"+this.math+"\t"+total+"\t"+average+"\t"+grade(average));
	
	}
	String grade(double average) {
		String grade;
		if(average>=95) grade="A+";
		else if(average>=90) grade="A";
		else if(average>=85) grade="B+";
		else if(average>=80) grade="B";
		else if(average>=75) grade="C+";
		else if(average>=70) grade="C";
		else if(average>=65) grade="D+";
		else if(average>=60) grade="D";
		else grade="F";
		
		return grade;
	}
	
}