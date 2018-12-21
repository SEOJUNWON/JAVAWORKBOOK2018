import java.util.Scanner;

import workbook.StepA.stepAManager;
import workbook.StepB.stepBManager;
import workbook.StepC.stepCManager;
import workbook.StepD.stepDManager;

public class WBManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 Step은?");
		String step = s.next();
		if(step.equalsIgnoreCase("A")) 
			new stepAManager();
		if(step.equalsIgnoreCase("B")) 
			new stepBManager();
		if(step.equalsIgnoreCase("C")) 
			new stepCManager();
		if(step.equalsIgnoreCase("D")) 
			new stepDManager();
		
		System.out.printf("종료되었습니다.\n");
	}	
}
