public class es8{
	public static void main(String[] args){
		int n;
		
		if(args.length == 0 || args.length >=2){
			System.out.println("Errore (num argomenti)");
			System.exit(1);
		}
		
		try{
			n = Integer.parseInt(args[0]);
			System.out.println("Fattoriale: " + factorial(n));
		}catch(NumberFormatException exc){
			System.out.println("Errore");
			System.exit(1);
		}
	}
	
	public static int factorial(int n){		
		if(n<0){
			throw new IllegalArgumentException();
		}
		
		if(n == 0){
			return 1;
		}

		return n*factorial(n-1);
	}
}