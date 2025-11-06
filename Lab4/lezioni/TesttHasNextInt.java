import java.util.Scanner;

public class TesttHasNextInt{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci un numero intero: ");		

		while(in.hasNextInt()){
			int token = in.nextInt();
			System.out.println("Hai digitato: " + token);
		}
		
		System.out.println("Sono uscito dal ciclo");
	}
}