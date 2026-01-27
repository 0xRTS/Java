public class es6{
	public static void main(String[] args){
		int[] a = {1, 2, 3};
		int[] b = {11, 22, 33};
		
		System.out.println(printArray(a));
		
		System.out.println(printArray(randomIntArray(5, 10)));
		System.out.println(printArray(remove(a, 2)));
		System.out.println(printArray(removeSorted(b, 1)));
		System.out.println(printArray(insert(a, 105)));
		System.out.println(printArray(insertSorted(b, 2, 444)));
		System.out.println(findMin(a));
		System.out.println(findMax(a));
		System.out.println(findPos(b, 33));
		System.out.println(findPos(b, 9));
	}

	public static int[] resize(int[] arr, int len){
		int[] newArr = new int[len];

		if(arr.length>len){
			for(int i=0; i<len; i++){
				newArr[i] = arr[i];
			}
		}else{			
			for(int i=0; i<arr.length; i++){
				newArr[i] = arr[i];
			}			
		}
		
		return newArr;
	}
	
	public static double[] resize(double[] arr, int len){
		double[] newArr = new double[len];

		if(arr.length>len){
			for(int i=0; i<len; i++){
				newArr[i] = arr[i];
			}
		}else{			
			for(int i=0; i<arr.length; i++){
				newArr[i] = arr[i];
			}			
		}
		
		return newArr;
	}
	
	public static int[] randomIntArray(int length, int n){
		int[] arr = new int[length];
		
		for(int i=0; i<length; i++){
			arr[i] = (int)(n*Math.random());
		}
		
		return arr;
	}
	
	public static String printArray(int[] v){
		String s = "";
		
		for(int i = 0; i<v.length; i++){
			s += v[i] + " ";
		}
		
		return s;
	}
	
    public static int[] remove(int[] v, int index){//eliminare un elemento (ordine non importante, restituire l'array ridimensionato)
		v[index] = v[v.length-1];
		
		return resize(v, v.length-1);
	}

    public static int[] removeSorted(int[] v, int index){//eliminare un elemento (ordine importante, restituire l'array ridimensionato)
		for(int i=index; i<v.length-1; i++){
			v[i] = v[i+1];
		}
		
		return resize(v, v.length-1);
	}
	
    public static int[] insert(int[] v, int value){//inserire un elemento (ordine non importante, restituire l'array ridimensionato)
		v = resize(v, v.length+1);

		v[v.length-1] = value;
		
		return v;
	}
	
    public static int[] insertSorted(int[] v, int index, int value){//inserire un elemento (ordine importante, restituire l'array ridimensionato)
		v = resize(v, v.length+1);

		for(int i=v.length-1; i>index; i--){
			v[i] = v[i-1];
		}
		
		v[index] = value;
		
		return v;
	}
	
    public static int findMin(int[] v){
		int min = v[0];
		
		for(int i=1; i<v.length; i++){
			if(v[i]<min){
				min = v[i];
			}
		}
		
		return min;
	}

    public static int findMax(int[] v){
		int max = v[0];
		
		for(int i=1; i<v.length; i++){
			if(v[i]>max){
				max = v[i];
			}
		}
		
		return max;
	}

    public static int findPos(int[] v, int target){
		int pos = -1;
		
		for(int i=0; i<v.length; i++){
			if(v[i] == target){
				pos = i;
				break;
			}
		}
		
		return pos;
	}
}