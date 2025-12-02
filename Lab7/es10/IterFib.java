import java.util.Scanner;

public class IterFib{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int n; 
		
		if(args.length != 1){
			System.out.print("Inserire n: ");
			n = Integer.parseInt(console.nextLine());
		}else{
			n = Integer.parseInt(args[0]);
		}
		
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();
		
		System.out.println("Il " + n + "-esimo numero della serie di Fib. è: " + iterativeFib(n));
		
		//long end = System.currentTimeMillis();
		long end = System.nanoTime();
		
		System.out.println("Tempo esecuzione metodo: " + Math.round((end - start)/1000000.0) +  " millisecondi");
	
	}
	
	public static long iterativeFib(int n){
		if(n<0){
			throw new IllegalArgumentException();
		}
		
		long a = 0; //F(0)
		long b = 1; //F(1)
		
		if(n == 0){
			return a;
		}
		
		for(int i=2; i<=n; i++){
			long temp = a+b; //somma due numeri prec.
			a=b; //avanza a 
			b = temp; //b = somma
		}
		
		return b; 
	}
}
