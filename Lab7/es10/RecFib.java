import java.util.Scanner;

public class RecFib{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int n; 
		
		if(args.length != 1){
			System.out.print("Inserire n: ");
			n = Integer.parseInt(console.nextLine());
		}else{
			n = Integer.parseInt(args[0]);
		}
		
		System.out.println("Il " + n + "-esimo numero della serie di Fib. è: " + recursiveFib(n));
		
	}
	
	public static long recursiveFib(int n){
		if(n == 0){
			return 0;
		}
		
		if(n == 1){
			return 1;
		}
		
		return recursiveFib(n-1) + recursiveFib(n-2);
	}
}