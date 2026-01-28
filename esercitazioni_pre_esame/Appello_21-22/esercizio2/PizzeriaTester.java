import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class PizzeriaTester{
	public static void main(String[] args){
		PizzaMap pizz = new PizzaMap();
		
		try{
			FileReader reader = new FileReader("pizze.txt");
			Scanner in = new Scanner(reader);
			
			while(in.hasNextLine()){
				Scanner riga = new Scanner(in.nextLine());
				pizz.put(riga.next(), Double.parseDouble(riga.next()));
				
				riga.close();
			}
			
			in.close();
		}catch(FileNotFoundException exc){
			System.out.println("File non trovato");
		}		
		
		System.out.println(pizz.toString()); 
		System.out.println(pizz.printMenu());
		
		double costo=0;
		costo+=(Double)(pizz.get("Margherita"));
		costo+=(Double)(pizz.get("Bufala"));
		costo+=2*(Double)(pizz.get("Prosciutto"));

		System.out.println("Prezzo (m + b + pc): " + costo);
		

	
	}	
}