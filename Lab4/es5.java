import java.util.Scanner;

public class es5{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);

		String s1;
		String s2;
		String s3;
		
		do{	
			System.out.println("\nInserire stringhe (una per riga)");
			s1 = console.nextLine();
			s2 = console.nextLine();
			s3 = console.nextLine();
		}while(s1.compareTo(s2) == 0 || s2.compareTo(s3) == 0 || s1.compareTo(s3) == 0);
		
		System.out.println("\nStrighe ordinate:");
		if(s1.compareTo(s2)<0){ //s1 precede s2 nell'ordinameno lessicografico
			if(s2.compareTo(s3)<0){ //s2 precede s3
				System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n");
			}else { //s3 precede s2
				if(s1.compareTo(s3)<0){//s1 precede s3
					System.out.println(s1 + "\n" + s3 + "\n" + s2 + "\n");				
				}else{ //s3 precede s1
					System.out.println(s3 + "\n" + s1 + "\n" + s2 + "\n");				
				}
			}
		}else { //s2 precede s1 nell'ordinamento lessicografico
			if(s1.compareTo(s3)<0){ //s1 precede s3
				System.out.println(s2 + "\n" + s1 + "\n" + s3 + "\n");
			}else { //s3 precede s1
				if(s2.compareTo(s3)<0){//s2 precede s3
					System.out.println(s2 + "\n" + s3 + "\n" + s1 + "\n");				
				}else{ //s3 precede s2
					System.out.println(s3 + "\n" + s2 + "\n" + s1 + "\n");				
				}
			}
		}
		
		console.close();
	}
}