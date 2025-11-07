import java.util.Scanner;

public class DecodeCeasar{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String decifrata="";
		int key;
		int sup;
		
		System.out.print("Inserire una stringa cifrata: ");
		String stringa = console.nextLine();
		stringa = stringa.toUpperCase();
		
		do{
			System.out.print("Inserire una chiave (0 < key < 26): ");
			key = console.nextInt();
		}while(key<=0 || key>=26);
		
		for(int i = 0; i<stringa.length(); i++){
			if(chars.indexOf(stringa.charAt(i)) - key < 0){
				sup = (chars.indexOf(stringa.charAt(i)) - key) + 26;
				decifrata += chars.charAt(sup);				
			}else{
				decifrata += chars.charAt(chars.indexOf(stringa.charAt(i)) - key);				
			}
		}
		
		System.out.println("Stringa decifrata: " + decifrata);
		console.close();
	}
}