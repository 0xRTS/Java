import java.util.Scanner;

public class es1{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		boolean check = true;
		int ore1=0;
		int ore2=0;
		int minuti1=0;
		int minuti2=0; 	
			
		do{
			System.out.print("Inserire il primo orario: ");
			String time1 = console.nextLine();
			
			ore1 = Integer.parseInt(time1.substring(0, 2));
			minuti1 = Integer.parseInt(time1.substring(2));
			
			if(time1.length()!=4 || ore1>24 || ore1<0 || minuti1>59 || minuti1<0){
				check = false;
				System.out.println("Inserimento errato");
			}else{
				check = true;
			}
		}while(!check);
		
		check = true;
		
		do{
			System.out.print("Inserire il secondo orario: ");
			String time2 = console.nextLine(); 	
			
			ore2 = Integer.parseInt(time2.substring(0, 2));
			minuti2 = Integer.parseInt(time2.substring(2));
			
			if(time2.length()!=4 || (ore2*60+minuti2)<(ore1*60+minuti1) || ore2>24 || ore2<0 || minuti2>60 || minuti2<0){
				check = false;
				System.out.println("Inserimento errato");
			}else{
				check = true;
			}
		}while(!check);
		
		int diff = (ore2*60+minuti2)-(ore1*60+minuti1); //differenza in minuti
		
		System.out.println("Tempo trascorso: " + diff/60 + " ore e " + diff%60 + " minuti");
		
	}
}