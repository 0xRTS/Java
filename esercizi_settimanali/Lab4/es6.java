import java.util.Scanner;

public class es6{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		
		int number;
		boolean bis = false;
		
		System.out.print("Inserire numero: ");
		number = console.nextInt();
		
		while(number <= 0){
			System.out.print("Il numero inserito deve essere positivo.\nInserire numero: ");
			number = console.nextInt();
		}
		
		/*senza operatori booleani
		if(number>1582){
			if(number % 4 == 0){
				bis = true;
				
				if(number % 400 == 0){
					bis = true;
				}else{
					if(number % 100 == 0){
						bis = false;
					}	
				}		
			}else{
				bis = false;
			}
			
			if(bis){
				System.out.println("Anno bisestile");
			}else{
				System.out.println("Anno non bisestile");
			}
		}else{
			System.out.println("Anno precedente al calendario gregoriano (1582)")
		}
		*/
		
		//con operatori booleani
		if(number>1582){
			if((number % 4 == 0 && number % 100 != 0) || number % 400 == 0){
				bis = true;	
			}else{
				bis = false;
			}	
			
			if(bis){
				System.out.println("Anno bisestile");
			}else{
				System.out.println("Anno non bisestile");
			}
		}else{
			System.out.println("Anno precedente al calendario gregoriano (1582)");
		}
		
		console.close();
	}

}