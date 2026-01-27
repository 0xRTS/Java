import java.util.Scanner;

public class interruttoreTester{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		Interruttore i1 = new Interruttore();
		Interruttore i2 = new Interruttore();
		Interruttore i3 = new Interruttore();
		
		int num;

		do{			
			System.out.println("interruttore 1: " + i1.printStatus());
			System.out.println("interruttore 2: " + i2.printStatus());
			System.out.println("interruttore 3: " + i3.printStatus());
			if(i1.isBulbOn()){
				System.out.println("Lampadina accesa");
			}else{
				System.out.println("Lampadina spenta");	
			}
	
			do{
				System.out.print("Scegli interruttore su cui operare: ");
				num = in.nextInt();
			}while(num<0 || num > 3);
			
			switch (num){
				case 1: 
					i1.changeStatus();
					break;
				case 2: 
					i2.changeStatus();
					break;
				case 3: 
					i3.changeStatus();
					break;
			}
		}while(num!=0);
	}
}