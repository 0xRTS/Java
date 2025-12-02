public class es12{
	public static void main(String[] args){
		if(args.length != 2){
			throw new IllegalArgumentException();
		}
		
		try{
			int dim = Integer.parseInt(args[0]); 
			int n = Integer.parseInt(args[1]); 	
				
			int[] arr = new int[dim];
			
			for(int i=0; i<dim; i++){
				arr[i] = (int)(Math.random()*(n+1));
			}
			
			System.out.println("---------------");
			
			for(int i = 0; i<arr.length; i++){
				System.out.println(arr[i]);
			}
			
			System.out.println("---------------");

			System.out.println("valore minimo di arr: " + findMin(arr, 0, 0));
		}catch(NumberFormatException exc){
			System.out.println("Dim e n non sono interi.");
			System.exit(1);
		}
	}
	
	public static int findMin(int[] arr, int min, int i){
		if(arr.length == i){//finiti i controlli
			return min;
		}
		
		if(arr[i]<min){
			min = arr[i];
		}
		
		return findMin(arr, min, i+1);
	}
}