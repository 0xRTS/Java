import java.util.Scanner;

public class es6{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double somma = 0; 
		double sommaAbs = 0;
		double prodotto = 0;
		double valoreMedio = 0;
		int inseriti = 0; 
		
		System.out.println("input: ");
		
		while(in.hasNextDouble()){
			double numb = in.nextDouble();
			inseriti++;
			
			somma+=numb;
			sommaAbs+=Math.abs(numb);
			
			if(inseriti<2){
				prodotto=numb;
			}else{
				prodotto*=numb;
			}
		}
		
		if(inseriti<2){
			System.out.println("Errore.");
		}else{
			valoreMedio = somma/inseriti;
			System.out.println("somma: " + somma);
			System.out.println("somma (abs): " + sommaAbs);
			System.out.println("valore medio: " + valoreMedio);
			System.out.println("prodotto: " + prodotto);
		}
		
		in.close();
	}
	
}