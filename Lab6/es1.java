public class es1{
	public static void main(String[] args){
		int[] a = new int[10];
		
		for(int i = 0; i<a.length; i++){
			a[i] = i;
		}
		
		//a
		System.out.println("lunghezza arr: " + a.length);
		System.out.println("---------------");
		
		for(int i = 0; i<a.length; i++){
			System.out.println("a[" + i + "]: " + a[i]);
		}
		
		System.out.println("---------------");
		
		for(int i = a.length-1; i>=0; i--){
			System.out.println("a[" + i + "]: " + a[i]);
		}

		incrementAll(a);
	
		System.out.println("---------------");
		
		for(int i = 0; i<a.length; i++){
			System.out.println("a[" + i + "]: " + a[i]);
		}

		System.out.println("---------------");

		int b = 0; 
		System.out.println("B: " + b);
		System.out.println("---------------");

		incrementVar(b);
		System.out.println("B: " + b);
		System.out.println("---------------");
		
	}
	
	public static void incrementAll(int[] a){
		for(int i = 0; i<a.length; i++){
			a[i] += 1;
		}
	}	
	
	public static void incrementVar(int b){
		b+=1;
	}
}