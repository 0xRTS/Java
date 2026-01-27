import java.util.Scanner;

public class ContaInteri{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int count=0;
		
		System.out.println("Inserire una sequenza di numeri interi: ");
		
		while(in.hasNext()){
			try{
				int n = in.nextInt();
				count++;
			}catch(java.util.InputMismatchException exc){
				System.out.println("non intero");
				in.next(); //libero il flusso (da spazi o a capo in eccesso)
			}
		}
		
		System.out.println("Interi: " + count);
		
		in.close();
	}
}

//java file < input.txt > output.txt
//>> output.txt per non sovrascrivere (viene creato in ogni caso il file se non esiste)