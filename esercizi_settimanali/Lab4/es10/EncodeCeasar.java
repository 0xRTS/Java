import java.util.Scanner;

public class EncodeCeasar{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String cifrata="";
		int key;
		int sup;
		
		System.out.print("Inserire una stringa: ");
		String stringa = console.nextLine();
		stringa = stringa.toUpperCase();
		
		do{
			System.out.print("Inserire una chiave (0 < key < 26): ");
			key = console.nextInt();
		}while(key<=0 || key>=26);
		
		for(int i = 0; i<stringa.length(); i++){
			if(chars.indexOf(stringa.charAt(i)) + key +1 > 26){ //+1 in quanto indexOf restituisce la posizione a partire da 0
				sup = (chars.indexOf(stringa.charAt(i)) + key) - 26;
				cifrata += chars.charAt(sup);				
			}else{
				cifrata += chars.charAt(chars.indexOf(stringa.charAt(i)) + key);				
			}
		}
		
		System.out.println("Stringa cifrata: " + cifrata);
		console.close();
	}
}