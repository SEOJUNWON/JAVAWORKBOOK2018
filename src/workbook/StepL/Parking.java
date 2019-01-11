package workbook.StepL;

import java.util.*;
import java.text.SimpleDateFormat;


public class Parking {
	public String name;
	public int price;
	public String made_in;
	ArrayList<ParkingCar> cars = new ArrayList<ParkingCar>();
	
	SimpleDateFormat f1 = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분 ", Locale.KOREA);
	SimpleDateFormat f2 = new SimpleDateFormat("YYYY-MM-dd hh:mm", Locale.KOREA);
	SimpleDateFormat f3 = new SimpleDateFormat("YYYYMMddhhmm", Locale.KOREA);
	public Parking() {
		input();
		System.out.println("종료되었습니다. ");
	}
	void input() {
		int type,how_many,p_num;
		String num;
		String car_type;
		int out,delete;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("주차할 수 있는 차의 수를 입력하세요 : ");
		how_many = s.nextInt();
		System.out.println("총 "+how_many+"대를 주차할 수 있습니다. \n\n");
		while(true) {
			
			System.out.println("-----------------------------------------------");
			System.out.print("1)입차 2)출차 3)리스트 4)입차 총개수 5)주차잔여개수 6)종료 ==> ");
			type = s.nextInt();
			
			if(type==6) break;
			
			if(type==1) {
				System.out.print("입차할 차의 번호와 차종을 입력하세요. ");
				num=s.next();
				car_type=s.next();
				p_num=getP_Num(how_many);
				if(p_num==-1) {}
				else {
					Date d = new Date();
					String today = f1.format(d);
					String today2 = f2.format(d);
					String today3 = f3.format(d);
					System.out.println(p_num);
					cars.add(p_num-1,new ParkingCar(num,car_type,today,p_num,today2,today3));        
					cars.get(p_num-1).in_print();
				}
				
			}
			else if(type==2) {
				for(int i=0;i<cars.size();i++) {
					cars.get(i).list_print();
				}
				System.out.print("==> 출차 번호를 입력하세요 : ");
				out=s.nextInt();
				int out_index=getIndex(out);
				
				if(!(out_index==-1)) {
					Date d=new Date();
					String out_date=f3.format(d);
					String out_date2=f2.format(d);
					int time1 = Integer.parseInt(out_date.substring(8, 10));
					int time2 = Integer.parseInt(out_date.substring(10, 12));
					int time5=Integer.parseInt(cars.get(out_index).date3.substring(8, 10));
					int time6=Integer.parseInt(cars.get(out_index).date3.substring(10, 12));
					
					System.out.print("==> 현재 시간은 ["+out_date2+"]");
					getFee(time1,time2,time5,time6);
					cars.remove(out_index);
					System.out.println("==> 정산되었습니다. \n");
				}
				else System.out.println("잘못입력하셨습니다. \n");
				
			}
			
			else if(type==3) {
				for(int i=0;i<cars.size();i++) {
					cars.get(i).list_print();
				}
				System.out.println(how_many-cars.size()+"대 주차가능. \n");
			}
			else if(type==4) {
				System.out.println("총 "+cars.size()+"대가 주차되어 있습니다.\n");
			}
			else if(type==5) {
				System.out.println("주차 가능한 자리는 "+(how_many-cars.size())+"대입니다.\n");
			}
			
		}
		
	}
	void getFee(int out_hour,int out_minute,int start_hour, int start_minute) {
		int charge=CalcParking(start_hour, start_minute,out_hour, out_minute);
		System.out.println("이므로 주차금액은 "+charge+"원입니다. ");
	}
	int CalcParking(int start_h, int start_m, int end_h, int end_m ) {
		int minute1 = start_h*60+start_m;
		int minute2 = end_h*60+end_m;
		int charge=0;
		int total_minute = minute2-minute1;
		
		
			charge=(total_minute/10)*500;
		
		return charge;
	}
	int getIndex(int out) {
		for(int i=0;i<cars.size();i++) {
			if(cars.get(i).p_num==out) 
				return i;
				
		}
		return -1;
	}
	
	int getP_Num(int how_many) {
		
		if(cars.size()<=0) {
			return 1;
		}
		else if(cars.size()==1) {
			if((cars.get(0).p_num)==1) {
				return 2;
			}
			else return 1;
		}
		else if(cars.size()==how_many) {
			System.out.println("만차입니다. ");
			return-1;
		}
		else {
			if(cars.get(0).p_num==1) {
				for(int i=1;i<cars.size();i++) {
					if(!(((cars.get(i).p_num)-1)==cars.get(i-1).p_num)) {
					 return cars.get(i-1).p_num+1;
					}
					
				}
				return cars.get(cars.size()-1).p_num+1;
			}
			else {
				return 1;
			}
			
			
			
		}
		
	}
	boolean space() {
		if(cars.size()<=0) return true;
		else return false;
	}
	
}

class ParkingCar{
	String type;
	String num;
	String date,date2,date3;
	int p_num;
	
	 ParkingCar(String t_num, String t_type, String t_date,int t_pnum,String t_date2,String t_date3){
		this.type=t_type;
		this.num=t_num;
		this.date=t_date;
		this.p_num=t_pnum;
		this.date2=t_date2;
		this.date3=t_date3;
	}
	void in_print() {
		System.out.println("["+this.p_num+"번]"+this.date+" 입차 되었습니다. ");
		System.out.print("\n");
	}
	void list_print() {
		System.out.println("["+this.p_num+"번]"+this.num+" "+this.type+" "+date2);
	}
	
}
