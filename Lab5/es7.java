import java.util.Scanner;

public class es7{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int inseriti = 0;
		double D = 0;
		double somma = 0;
		double sommaQuadrati = 0;
		
		System.out.println("input: ");
		
		while(in.hasNextDouble()){ 
			double numb = in.nextDouble();
			inseriti++;
			
			somma += numb;
			sommaQuadrati += numb*numb;
		}
		
		if(inseriti<2){
			System.out.println("Errore");
		}else{
			D = Math.sqrt((sommaQuadrati - somma*somma/inseriti)/(inseriti-1));
			System.out.println("Deviazione standard: " + D);
		}
		
		in.close();
	}
}