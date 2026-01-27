import java.util.Scanner;

public class es3{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		
		System.out.print("Inserire stringa: ");
		String str = console.nextLine();
		
		Scanner scan = new Scanner(str);
		
		while(scan.hasNext()){
			System.out.println(scan.next());
		}
		
		console.close();
		scan.close();
	}
}