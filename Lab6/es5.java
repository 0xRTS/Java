import java.util.Scanner;

public class es5{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserire un numero intero:");
		int n = in.nextInt();
		
		double[] arr1 = new double[n];
		double[] arr2 = new double[n];
		
		System.out.println("\nInserisci gli elementi del primo array, uno per riga:");
		for(int i=0; i<n; i++){
			arr1[i]= in.nextDouble();
		}
		
		System.out.println("\nInserisci gli elementi del secondo array, uno per riga:");
		for(int i=0; i<n; i++){
			arr2[i]= in.nextDouble();
		}
		
		double sommaTot = 0;
		
		System.out.println("\nSomma di ciascuna componente corrispondente: ");
		for(int i=0; i<n; i++){
			System.out.print(arr1[i] + arr2[i] + " ");
			sommaTot += arr1[i] + arr2[i];
		}
		
		System.out.println("\n\nSomma totale: " + sommaTot);		
	}

}