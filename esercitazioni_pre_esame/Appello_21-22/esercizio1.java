import java.util.Scanner;

public class esercizio1{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		
		System.out.print("Inserire una stringa: ");
		
		String s = console.nextLine();
		
		char[] arr = new char[s.length()];
		
		for(int i = 0; i<s.length(); i++){
			arr[i] = s.charAt(i);
		}
		
		int pos = 0;
		String result = "";
		
		result = cercaVocali(arr, 0, result);
		
		System.out.println("Stringa solo con vocali: " + result);
		System.out.println("Stringa solo con vocali, in ordine inverso: " + reverseString(result));
	}
	
	public static String cercaVocali(char[] arr, int pos, String result){//metodo ricorsivo
	//RICORDARE: chiamare il metodo usando il return
		char[] vocali = {'a', 'e', 'i', 'o', 'u'};
		
		if(pos!=arr.length){
			for(int i = 0; i<vocali.length; i++){		
				if(((arr[pos]+"").toLowerCase()).equals(vocali[i]+"")){
					return cercaVocali(arr, pos+1, result+=arr[pos]); 
				}	
			}	
			
			return cercaVocali(arr, pos+1, result); 
		}
		
		return result;
	}
	
	public static String reverseString(String str){//metodo inverti stringa
		String ret = "";
		
		for(int i=0; i<str.length(); i++){
			ret+=str.charAt(str.length()-i-1);
		}
		
		return ret;
	}
}