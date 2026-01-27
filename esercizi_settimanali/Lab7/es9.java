import java.util.Scanner;

public class es9{
	public static void main(String[] args){
		if(args.length!=2){
			throw new IllegalArgumentException();
		}
		
		int m;
		int n;
		
		try{
			m = Integer.parseInt(args[0]);
			n = Integer.parseInt(args[1]);
			
			if(m<=0 || n<=0){
				System.out.println("Errore. Numeri non (entrambi) positivi");
				System.exit(1);
			}
			
			System.out.println("MCD: " + MCD(m, n));
		
		}catch(NumberFormatException exc){
			System.out.println("Errore. Argomenti non (entrambi) interi");
			System.exit(1);
		}
	}
	
	public static int MCD(int m, int n){
		if(m%n==0){
			return n;
		}else{
			return MCD(m%n, n);
		}
	}
	
	
}