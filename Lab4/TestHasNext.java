import java.util.Scanner;

public class TestHasNext{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			String token = in.next();
			System.out.println("Hai digitato: " + token);
			
			if(token.equalsIgnoreCase("Q")){//se inserisco la srtinga Q quitto
				System.exit(1); //esco
			}
		}
	}
}