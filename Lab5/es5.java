import java.util.Scanner;

public class es5{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		String str = "";
		String out = "";
				
		do{
			System.out.print("input : ");
			str = in.nextLine();		

			for(int i=0; i<str.length(); i++){
				if(str.charAt(i)!='A' && str.charAt(i)!='C' && str.charAt(i)!='G' && str.charAt(i)!='T'){
					valid = false;
				}else{
					valid = true;
				}
			}
		}while(!valid);

		for(int i=0; i<str.length(); i++){
			char c = '\0'; 
			
			if(str.charAt(str.length()-i-1) == 'A'){
				c = 'T';
			}else if(str.charAt(str.length()-i-1) == 'T'){
				c = 'A'; 
			}else if(str.charAt(str.length()-i-1) == 'C'){
				c = 'G';
			}else if(str.charAt(str.length()-i-1) == 'G'){
				c = 'C';
			}
			
			out += c;
		}		
		
		System.out.println("output: " + out);
		
		in.close();
	}
	
}