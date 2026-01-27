import java.util.Scanner;

public class es9{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		
		System.out.print("Inserire numero: ");
		int number = console.nextInt();
		
		while(number<=0){
			System.out.print("Il numero deve essere positivo.\nInserire numero: ");
			number = console.nextInt();
		}
		
		int N = number + 200;
		
		/*while
		while(number < N){
			System.out.print(number + " ");
			number+=1;
		}
		
		for*/
		
		for(int i = number; i<N; i++){
			System.out.print(i + " ");
		}
		
		console.close();
	}
	
}