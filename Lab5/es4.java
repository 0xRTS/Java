import java.util.Scanner;

public class es4{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("input (Q per terminare l'inserimento): ");
		String str = "";
		String out = "";
		
		while(in.hasNext()){ //check per eventuali token disponibili
			str = in.nextLine();
			
			if(!str.equals("Q")){ //controlla che non si voglia uscire
				for(int i=0; i<str.length(); i++){
					out += str.charAt(str.length()-i-1); //stringa appena inserita, rovesciata e concatenata 
				}
			}else{
				break;
			}
		}
		
		System.out.println("output: " + out);
		
		in.close();
	}
	
}