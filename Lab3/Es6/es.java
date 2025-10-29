import java.util.Scanner;

public class es{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserire stringa:");
		String s = input.nextLine();
		String dim;
		String sup;
		
		if(s != null && s.length()>0){
			if(s.charAt(s.length()-1) == 'o'){
				dim = "ino";
				sup = "issimo";
			} else {
				dim = "ina";
				sup = "issima";
			}	
		
			System.out.println("Stringa con primo caratttere maiuscolo: " + s.substring(0, 1).toUpperCase() + s.substring(1));
			System.out.println("Stringa (forma diminutiva): " + s.substring(0, 1).toUpperCase() + s.substring(1, s.length()-1) + dim);
			System.out.println("Stringa (superlativo assoluto): " + s.substring(0, 1).toUpperCase() + s.substring(1, s.length()-1) + sup);
		}else{
			System.out.println("Stringa non valida");
		}
		
		input.close();
	}
}