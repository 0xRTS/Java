import java.util.Scanner;

public class es{
	public static void main(String[] args){		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserire due numeri interi: ");

		double value1 = input.nextInt();
		double value2 = input.nextInt();
		
		if(value1>0 && value2>0){
			System.out.println("Somma: " + (value1 + value2));
			System.out.println("Prodotto: " + (value1 * value2));
			
			if(value1!=value2){
				System.out.println("Valore medio: " + ((value1 + value2)/2));
				
				if(value1>value2){
					System.out.println("Valore massimo: " + value1);	
					System.out.println("Valore minimo: " + value2);	
					System.out.println("Valore assoluto della differenza: " + (value1 - value2));
				}else{
					System.out.println("Valore massimo: " + value2);	
					System.out.println("Valore minimo: " + value1);	
					System.out.println("Valore assoluto della differenza: " + (value2 - value1));
				}			
			}else{
				System.out.println("Valore medio: " + value1);
				System.out.println("Numeri uguali");
				System.out.println("Valore assoluto della differenza: 0");
				
			}

	
		}else{
			System.out.println("Numeri inseriti non validi");
		}
		
		input.close();
	}
}