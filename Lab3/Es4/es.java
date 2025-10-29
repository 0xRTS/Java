import java.util.Scanner;

public class es{
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Inserisci stringa: ");
			String a = scan.next();
			String b = scan.next();
			String c = scan.next();
			
			System.out.println(c + "\n" + b + "\n" + a + "\n");
			
			scan.close();
	}
}