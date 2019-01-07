package workbook.StepK;


import java.util.*;


public class SaveMenu {
	public SaveMenu() {
		MenuPan menu = new MenuPan();
		menu.input();
		System.out.println("========================================================");
		System.out.println("메뉴번호\t메뉴명\t원산지\t1인분가격 ");
		menu.print();
}
}
class MenuPan{
	public int num;
	public String name;
	public String made_in;
	public int price;
	String white;
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("메뉴의 번호, 메뉴명, 원산지, 가격을 입력하시오. ");
		this.num=s.nextInt();
		
		this.name=s.next();
		
		this.made_in=s.next();
		
		this.price=s.nextInt();
	}
	void print() {
		System.out.println(this.num+"\t"+name+"\t"+made_in+"\t"+price);
	}
	
}