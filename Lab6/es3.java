public class es3{
	public static void main(String[] args){
		int[] a = {1, 2, 3};
		double[] b = {11, 22, 33};
		
		a = resize(a, 2);
		b = resize(b, 4);
		
		for(int i=0; i<a.length; i++){
			System.out.println("a[" + i + "]: " + a[i]);
		}
		
		for(int i=0; i<b.length; i++){
			System.out.println("b[" + i + "]: " + b[i]);
		}
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
}