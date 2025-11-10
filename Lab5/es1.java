import java.util.Scanner;

public class es1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserire N: ");
		int N = in.nextInt();
		
		for(int i = 1; i<=N; i++){
			System.out.print(i + " ");
			if(i%10==0){
				System.out.println("\n");
			}
		}
		
		in.close();
	}
	
}