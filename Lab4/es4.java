import java.util.Scanner;

public class es4{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int number;
		
		for(int i=0; i<2; i++){
			System.out.print("Inserire un numero pari intero: ");
			number = console.nextInt();
			
			if(number%2==0){
				i=2;
				System.out.println("Numero " + number + " pari\n");
			}else{
				System.out.println("Numero inserito dispari.\n");
			}
		}
		
		console.close();
	}
}