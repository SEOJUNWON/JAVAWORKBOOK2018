package workbook.StepL;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	ArrayList<StudentArray> student = new ArrayList<StudentArray>();
	String name,search;
	String f_m;
	String stuNum;
	String address,Y_N;
	int type,change,delete,count=0;
	int index;
	String phoneNum;
	int a[]=new int[100];
	public Student() {
		input();
		System.out.println("종료되었습니다. ");
	}
	void input() {
		
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------------------------------------------------------");
			System.out.print("1)학생등록 2)정보수정 3)삭제 4)리스트 5)이름검색 6)복학생리스트 7)주소검색 8)종료 ==> ");
			type = s.nextInt();
			System.out.println("--------------------------------------------------------------------");
			if(type==8) break;
			
			if(type==1) {
				regist();
				student.add(new StudentArray(name,stuNum,f_m,address,phoneNum,Y_N));
				System.out.printf("총 %d명이 등록되었습니다. \n",student.size());
			}
			else if(type==2) {
				System.out.println("번호\t이름\t학번  \t성별\t주소\t전화번호\t복학생");
				for(int i=0;i<student.size();i++) {
					System.out.print((i+1)+"\t");
					student.get(i).list_print();
				}
				System.out.print("==> 수정할 번호를 입력하세요 : ");
				change=s.nextInt();
				regist();
				student.remove(change-1);
				student.add(change-1,new StudentArray(name,stuNum,f_m,address,phoneNum,Y_N));
				System.out.println("수정되었습니다.");
			}
			else if(type==3) {
				System.out.println("번호\t이름\t학번  \t성별\t주소\t전화번호\t복학생");
				for(int i=0;i<student.size();i++) {
					System.out.print((i+1)+"\t");
					student.get(i).list_print();
				}
				System.out.print("==> 삭제할 번호를 입력하세요 : ");
				delete=s.nextInt();
				student.remove(delete-1);
				System.out.println("삭제되었습니다. ");
			}
			else if(type==4) {
				System.out.println("이름     학번       성별     주소        전화번호        복학생");
				for(int i=0;i<student.size();i++) {
					student.get(i).list_print();
				}
				System.out.printf("\n총 %d명이 등록되었습니다. \n",student.size());
			}
			else if(type==5) {
				System.out.println("검색하실 이름을 입력하세요 : ");
				this.search=s.next();
				searchName();
				this.count=0;
			}
			else if(type==6) {
				searchNum();
				this.count=0;
			}
			else if(type==7) {
				System.out.println("검색하실 이름을 입력하세요 : ");
				this.search=s.next();
				searchAddress();
				this.count=0;
			}
			
		}
		
	}
	void regist() {
		Scanner s = new Scanner(System.in);
		System.out.print("학생이름, 학번, 성별을 입력하세요 : ");
		this.name=s.next();
		this.stuNum=s.next();
		this.f_m=s.next();
		System.out.print("주소를 입력하세요 : ");
		s.nextLine() ;
		this.address=s.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		this.phoneNum=s.next();
		
		System.out.print("복학생입니까?(Y/N) ");
		this.Y_N=s.next();
		
	}
	void searchName() {
		
		for(int i=0;i<student.size();i++) {
			if(student.get(i).name.contains(this.search)) {
				this.count++;
			}
		}
		System.out.println(this.count);
		int a[]=new int[this.count];
		
		for(int i=0;i<student.size();i++) {
			if(i==0) {
				for(int j=0;j<student.size();j++) {
					if(student.get(j).name.contains(search)) {
						this.a[i]=j;
						this.index=j;
						break;
					}
			}
			}
			else {
				for(int j=this.index+1;j<student.size();j++) {
					if(student.get(j).name.contains(search)) {
						this.a[i]=j;
						this.index=j;
						break;
					}
			}
			}
		}
	System.out.println("검색되었습니다.\n");
	System.out.println("번호\t이름    학번       성별      주소         전화번호     복학생");
	int l=0;
	for(int k=0;k<a.length;k++) {
		l=this.a[k];
		System.out.print((l+1)+"\t");
		student.get(l).list_print();
	}
	}
	void searchNum() {
		
		for(int i=0;i<student.size();i++) {
			if(student.get(i).Y_N.equalsIgnoreCase("Y")) {
				this.count++;
			}
		}
		int a[]=new int[this.count];
		for(int i=0;i<student.size();i++) {
			if(i==0) {
				for(int j=0;j<student.size();j++) {
					if(student.get(j).Y_N.equalsIgnoreCase("Y")) {
						this.a[i]=j;
						this.index=j;
						break;
					}
			}
			}
			else {
				for(int j= this.index+1;j<student.size();j++) {
					if(student.get(j).Y_N.equalsIgnoreCase("Y")) {
						this.a[i]=j;
						this.index=j;
						break;
					}
			}
			}
		}
		
	System.out.println("번호\t이름    학번       성별      주소         전화번호     복학생");
	int l=0;
	for(int k=0;k<a.length;k++) {
		l=this.a[k];
		System.out.print((l+1)+"\t");
		student.get(l).list_print();
	}
	System.out.println("복학생은 "+a.length+"명입니다.");
	}
	
	void searchAddress() {
		for(int i=0;i<student.size();i++) {
			if(student.get(i).address.contains(this.search)) {
				count++;
			}
		}
		int a[]=new int[count];
		for(int i=0;i<student.size();i++) {
			if(i==0) {
				for(int j=0;j<student.size();j++) {
					if(student.get(j).address.contains(search)) {
						this.a[i]=j;
						this.index=j;
						break;
					}
			}
			}
			else {
				for(int j=this.index+1;j<student.size();j++) {
					if(student.get(j).address.contains(search)) {
						this.a[i]=j;
						this.index=j;
						break;
					}
			}
			}
		}
	System.out.println("검색되었습니다.\n");
	System.out.println("번호\t이름    학번       성별      주소         전화번호     복학생");
	
	int l=0;
	for(int k=0;k<a.length;k++) {
		l=this.a[k];
		System.out.print((l+1)+"\t");
		student.get(l).list_print();
	}
	}
}

class StudentArray{
	String name,f_m,address,phoneNum;
	String stuNum,Y_N;
	
	StudentArray(String t_name, String snum, String fm, String add, String pnum, String p_Y_N ){
		this.name=t_name;
		this.f_m= fm;
		this.address=add;
		this.phoneNum=pnum;
		this.stuNum=snum;
		this.Y_N=p_Y_N;
	}
	void list_print() {
		System.out.printf("%s  %s    %s    %s   %s  %s\n",this.name,this.stuNum,this.f_m,this.address,this.phoneNum,this.Y_N);
	}
	
}