public class ArrayAlgs{	
	//SELECTION SORT
	public static int[] selectionSort(int arr[]){
		for(int i = 0; i<arr.length; i++){
			int minPos = findminPos(arr, i); //posizione del valore minimo
			
			if(i!=minPos){
				swap(arr, i, minPos);//swap dell'elemento minimo che va messo in posizione i				
			}
		}
		
		return arr;
	}
	
	//MERGESORT 
	public static int[] mergeSort(int arr[]){
		if(arr==null || arr.length <2){return arr;}
		
		int mid = arr.length/2; 
		int[] b = new int[mid];
		int[] c = new int[arr.length-mid];
		
		System.arraycopy(arr, 0, b, 0, b.length);
		System.arraycopy(arr, mid, c, 0, c.length);

		b = mergeSort(b);
		c = mergeSort(c);
		
		return merge(arr, b, c);
	}
	
	//INSERTION SORT
	public static int[] insertionSort(int arr[]){
		for(int i = 1; i<arr.length; i++){
			
			for(int j = i-1; j>=0; j--){
				if(arr[j]>arr[j+1]){
					swap(arr, j, j+1);
				}else{
					break;
				}
			}
		}
		
		return arr;
	}
	
	public static int[] merge(int a[], int b[], int c[]){
		int ia = 0, ib = 0, ic = 0; 
		
		while(ib < b.length && ic < c.length){
			if(b[ib] < c[ic]){
				a[ia++] = b[ib++];
			}else if (c[ic] < b[ib]){
				a[ia++] = c[ic++];
			}
		}
		
		//solo uno dei due viene fatto per terminare il completamento dell'array a
		while(ib < b.length){
				a[ia++] = b[ib++];
		}
		
		while(ic < c.length){
				a[ia++] = c[ic++];
		}
		
		return a;
	}
	
	public static int findminPos(int arr[], int from){
		int minPos = from;
		
		for(int i = from+1; i<arr.length; i++){
			if(arr[i]<arr[minPos]){
				minPos = i;
			}
		}
		
		return minPos;
	}
	
	public static int[] swap(int arr[], int pos1, int pos2){
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
		
		return arr;
	}
}