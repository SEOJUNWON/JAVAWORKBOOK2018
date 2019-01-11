package workbook.StepL;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Restaurant {
	public String name;
	public int price;
	public String made_in;
	ArrayList<orderMenu> menu = new ArrayList<orderMenu>();
	
	SimpleDateFormat f1 = new SimpleDateFormat("YYYY년 MM월 dd일 hh:mm분 ", Locale.KOREA);
	SimpleDateFormat f2 = new SimpleDateFormat("YYYY-MM-dd hh:mm", Locale.KOREA);
	SimpleDateFormat f3 = new SimpleDateFormat("YYYYMMddhhmm", Locale.KOREA);
	public Restaurant() {
		input();
		System.out.println("종료되었습니다. ");
	}
	void input() {
		int type,how_many,p_num;
		int num;
		int menu1,menu2,menu3;
		String Y_N;
		
		Scanner s = new Scanner(System.in);
	
		while(true) {
			
			System.out.println("-----------------------------------------------");
			System.out.print("1)주문 2)결제 3)리스트 4)종료 ==> ");
			type = s.nextInt();
			System.out.println("-----------------------------------------------");
			if(type==4) break;
			
			if(type==1) {
				System.out.print("손님 수를 입력하세요. ");
				num=s.nextInt();
				System.out.print("스테이크, 스파게티, 파스타의 개수를 입력하세요 : ");
				menu1=s.nextInt();
				menu2=s.nextInt();
				menu3=s.nextInt();
				System.out.print("멤버쉽 카드가 있습니까?(Y:있음) ");
				Y_N=s.next();
					Date d = new Date();
					String today = f1.format(d);
					menu.add(new orderMenu(num,menu1,menu2,menu3,Y_N,today,menu.size()));        
					menu.get(menu.size()-1).in_print();
				
				
			}
			else if(type==2) {
				int out;
				System.out.println("번호\t손님수\t스테이크\t스파게티\t파스타\t멤버쉽\t결제금액\t입장시간");
				for(int i=0;i<menu.size();i++) {
					System.out.print("["+(i+1)+"]");
					menu.get(i).list_print();
				}
				System.out.print("==> 결제하실 번호를 입력하세요 : ");
				out=s.nextInt();
				
					menu.remove(out-1);
					System.out.println("==> 결제완료되었습니다. \n");
				
				
			}
			
			else if(type==3) {
				System.out.println("번호\t손님수\t스테이크\t스파게티\t파스타\t멤버쉽\t결제금액\t입장시간");
				for(int i=0;i<menu.size();i++) {
					System.out.print("["+(i+1)+"]");
					menu.get(i).list_print();
				}
				System.out.print("\n");
			}
			
		}
		
	}
	
}

class orderMenu{
	String Y_N;
	String time;
	int num;
	int menu1,menu2,menu3;
	double total;
	int i;
	
	 orderMenu(int t_num, int steak, int spaghetti, int pasta, String t_Y_N, String t_time,int index){
		this.menu1=steak;
		this.menu2=spaghetti;
		this.menu3=pasta;
		this.num=t_num;
		this.time=t_time;
		this.Y_N=t_Y_N;
		this.i=index;
	}
	void in_print() {
		System.out.println("들어오신 시간은 "+this.time+"입니다. ");
		System.out.printf("총 금액은 %.0f 원입니다. \n\n",CalcFee());
	}
	void list_print() {
		System.out.printf("\t%d\t%d\t%d\t%d\t%s\t%.0f\t%s\n",this.num,this.menu1,this.menu2,this.menu3,this.Y_N,CalcFee(),this.time);
	}
	double CalcFee() {
		if(Y_N.equalsIgnoreCase("Y")) {
			total=(25000*this.menu1+15000*this.menu2+17000*this.menu3)*0.9;
			if(total<100000) {
				total=(total+total*0.07)*1.1;
			}
			else {
				total=(total+total*0.1)*1.1;
			}
		}
		else {
			total=(25000*this.menu1+15000*this.menu2+17000*this.menu3);
			if(total<100000) {
				total=(total+total*0.07)*1.1;
			}
			else {
				total=(total+total*0.1)*1.1;
			}
		}
		return total;
	}
	
}