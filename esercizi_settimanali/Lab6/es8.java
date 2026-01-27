import java.util.Scanner;

public class es8{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserire sequenza numeri: ");
		int[] arr = new int[0];
		
		while(in.hasNext()){
			if(in.hasNextInt()){
				arr = resize(arr, arr.length+1);
				arr[arr.length-1] = in.nextInt();
			}else{
				in.next();
			}
		}
		
		in.close();
	
		if(arr.length == 0){
			System.out.println("Nessun numero inserito");
		}else{
			int max = findMax(arr);
			double radice = Math.sqrt(max);
			
			if(radice == (int)radice && arr.length==(int)radice*(int)radice){
				int[][] q = new int [(int)radice][(int)radice];
				
				int cont = 0;
				
				for(int i=0; i<(int)radice; i++){
					for(int j=0; j<(int)radice; j++){
						q[i][j] = arr[cont];	
						cont++;
					}
				}

				for(int i=0; i<(int)radice; i++){
					for(int j=0; j<(int)radice; j++){
						System.out.print(q[i][j] + " ");
					}
					
					System.out.println();
				}
				
			}else{
				System.out.println("Numeri inseriti non validi per essere un quadrato perfetto");
			}
		}
	}
	
	public static int[] resize(int[] arr, int len){
		int[] arr2 = new int[len];
		
		if(len<arr.length){
			for(int i=0; i<len; i++){
				arr2[i] = arr[i];
			}
		}else if(len>arr.length){
			for(int i=0; i<arr.length; i++){
				arr2[i] = arr[i];
			}
		}
		
		return arr2;
	}
	
	public static int findMax(int[] arr){
		int max = arr[0];
		
		if(arr.length>=1){
			for(int i=1; i<arr.length; i++){
				if(arr[i]>max){
					max=arr[i];
				}
			}	
		}
		
		return max;
	}
}