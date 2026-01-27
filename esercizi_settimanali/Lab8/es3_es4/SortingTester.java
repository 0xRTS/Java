public class SortingTester{
	public static void main(String[] args){
		int n; 
		int[] A; 
		
		try{
			if(args.length==1){
				n = Integer.parseInt(args[0]);				
				A = new int[n];
				
				for(int i = 0; i<n; i++){
					A[i] = (int)(1+100*Math.random()); 
					//int n = (int)(a+(1+b-a)*Math.random());
				}
				
				int[] a = new int[n];
				System.arraycopy(A, 0, a, 0, n); 
				
				int[] b = new int[n];
				System.arraycopy(A, 0, b, 0, n); 
				
				int[] c = new int[n];
				System.arraycopy(A, 0, c, 0, n); 
				
				if(n <= 20){
					System.out.println("\nArr originale: ");
					System.out.println(printArr(A));

					System.out.println("---------------------------\n\nselectionSort: ");
					long start = System.currentTimeMillis();
					System.out.println(printArr(ArrayAlgs.selectionSort(a)));
					long end = System.currentTimeMillis();
					System.out.println("tempo di esecuzione: " + (end-start) + "ms");
					
					start = System.currentTimeMillis();
					System.out.println("\n---------------------------\n\nmergeSort: ");
					System.out.println(printArr(ArrayAlgs.mergeSort(b)));
					end = System.currentTimeMillis();
					System.out.println("tempo di esecuzione: " + (end-start) + "ms");

					start = System.currentTimeMillis();
					System.out.println("\n---------------------------\n\ninsertionSort: ");
					System.out.println(printArr(ArrayAlgs.insertionSort(c)));
					end = System.currentTimeMillis();
					System.out.println("tempo di esecuzione: " + (end-start) + "ms\n");
				}
		}
		
			
		}catch(NumberFormatException exc){
			System.out.println("Nessun parametro passato.");
			System.exit(1);
		}
	}
	
	public static String printArr(int[] arr){
		String str = "";
		
		for(int i = 0; i<arr.length; i++){
			str += arr[i] + "\n";
		}
		
		return str;
	}
}