package workbook.StepL;
import java.util.*;

public class MENU {
	public String name;
	public int price;
	public String made_in;
	
	public MENU() {
		input();
		System.out.println("종료되었습니다. ");
	}
	void input() {
		int type;
		String n;
		String made;
		int pri;
		int change,delete;
		
		Scanner s = new Scanner(System.in);
		ArrayList<MenuArray> menu = new ArrayList<MenuArray>();
		while(true) {
			System.out.print("1)추가 2)수정 3)삭제 4)리스트 5)총개수 6)종료 ==> ");
			type = s.nextInt();
			System.out.println("-----------------------------------------------");
			if(type==6) break;
			
			if(type==1) {
				System.out.print("메뉴명, 원산지, 가격을 입력하시오. ");
				n=s.next();
				made=s.next();
				pri=s.nextInt();
				menu.add(new MenuArray(n,made,pri));        
				System.out.println("입력되었습니다. \n");
			}
			else if(type==2) {
				System.out.print("==> 수정할 번호를 입력하세요 : ");
				change=s.nextInt();
				System.out.print("메뉴명, 원산지, 가격을 입력하시오. ");
				n=s.next();
				made=s.next();
				pri=s.nextInt();
				menu.remove(change-1);
				menu.add(change-1,new MenuArray(n,made,pri));
				System.out.println("수정되었습니다. \n");
			}
			else if(type==3) {
				System.out.println("메뉴번호\t메뉴이름\t원산지\t1인분가격");
				for(int i=0;i<menu.size();i++) {
					System.out.print((i+1)+"\t");
					menu.get(i).print();
				}
				System.out.print("==> 삭제할 번호를 입력하세요 : ");
				delete=s.nextInt();
				menu.remove(delete-1);
				System.out.println("삭제되었습니다. \n");
			}
			else if(type==4) {
				System.out.println("메뉴번호\t메뉴이름\t원산지\t1인분가격");
				for(int i=0;i<menu.size();i++) {
					System.out.print((i+1)+"\t");
					menu.get(i).print();
					
				}
			}
			else if(type==5) {
				System.out.println(menu.size()+"개의 메뉴가 등록되어 있습니다.\n");
			}
			
		}
		
	}
	
	
}

class MenuArray{
	String name;
	int price;
	String made_in;
	
	MenuArray(String n, String made, int pri ){
		this.name=n;
		this.made_in = made;
		this.price=pri;
	}
	void print() {
		System.out.println(this.name+"\t"+this.made_in+"\t"+this.price);
		System.out.print("\n");
	}
	
}
