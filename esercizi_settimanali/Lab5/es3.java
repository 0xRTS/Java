import java.util.Scanner;

public class es3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("input: ");
		String str = in.nextLine();
		String out = "";
		
		for(int i=0; i<str.length(); i++){
			out += str.charAt(str.length()-i-1);
		}
		
		System.out.println("output: " + out);
		
		in.close();
	}
	
}