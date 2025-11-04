public class es3{
	public static void main(String[] args){
		double v1 = 10000.00001;
		double v2 = 10000.0000;
		
		System.out.println("v1: " + v1 + "\nv2: " + v2);
		System.out.println("\nDifferiscono di un valore inferiore a 10^-6: " + approxDiff(v1, v2));
		System.out.println("Differiscono di un valore inferiore a 10^-6*max: " + approxDiffMax(v1, v2));
		
	}
	
	//approssimazione della differenza tenendo conto solamente del valore di precisione (VALUE)
	public static boolean approxDiff(double d1, double d2){
		final double VALUE = 1E-6;
		return Math.abs(d1-d2) < VALUE;
	}
	
	//approssimazione della differenza tenendo conto anche del numero maggiore
	public static boolean approxDiffMax(double d1, double d2){
		final double VALUE = 1E-6;
		double max = Math.max(Math.abs(d1), Math.abs(d2));
		return Math.abs(d1-d2) <= VALUE*max;
	}
}