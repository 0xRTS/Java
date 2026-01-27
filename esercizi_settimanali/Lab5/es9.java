import java.util.Scanner;

public class es9{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserire str1: ");
		String str1 = in.nextLine();
		
		System.out.print("Inserire str2: ");
		String str2 = in.nextLine();
		
		boolean check = false;
		
		for(int i = 0; i<str1.length(); i++){
			for(int j = str1.length(); j>i; j--){
				if(str1.substring(i, j).equals(str2)){
					check = true;
					break;
				}
			}	
			
			if(check){
				break;	
			}
		}
		
		if(str2.equals("") || check){
			System.out.println("str2 è sottostringa di str1");
		}else{
			System.out.println("str2 non è sottostringa di str1");
		}
		
		in.close();
	}
	
}