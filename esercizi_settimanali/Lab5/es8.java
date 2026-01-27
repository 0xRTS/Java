import java.util.Scanner;

public class es8{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int m; 
		int n;
		
		do{
			System.out.print("Inserire m: ");
			m = in.nextInt();
			
			System.out.print("Inserire n: ");
			n = in.nextInt();
		}while(m<n);
		
		while(m%n!=0){
			int sup; 
			sup = m;
			m = n;
			n = sup%n;
		}
		
		System.out.println("MCD: " + n);
		
		in.close();
	}
	
}