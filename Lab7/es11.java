public class es11{
	public static void main(String[] args){
		
		if(args.length != 1){
			System.exit(1);
		}
		
		String str = args[0];
		
		System.out.println("palindroma: " + palindroma(str));
	}
	
	public static boolean palindroma(String str){
		if(str.length()==0 || str.length() == 1){ //per forza di cose str è palindroma
			return true;
		}
		
		if(str.charAt(0) == str.charAt(str.length()-1)){//primo e ultimo carattere uguali	
			return palindroma(str.substring(1, str.length()-1)); //stringa senza primo e ultimo carattere
		}
		
		return false; //se non sono uguali il primo e ultimo carattere allora restituisco false, altrimenti continuo con la ricorsione
	}
	
}