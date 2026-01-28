public class PizzaMap extends FixedArrayMap{
	public Object put(Object key, Object value){
		if(!(key instanceof String) || !(value instanceof Double)){
			throw new IllegalArgumentException();
		}
		
		try{
			return super.put(key, value);
		}catch(FullMapException exc){
			p = resize(p);
			
			return super.put(key, value);
		}
		
	}
	
	public Pair[] resize(Pair[] arr){
		Pair[] nuovo = new Pair[arr.length*2];
		
		System.arraycopy(arr, 0, nuovo, 0, arr.length);
		return nuovo;
	}
	
	public String printMenu(){
		String s = "";
		
		Object[] a = new Object[p.length];
		a = selectionSort();
		
		for(int i = 0; i<a.length; i++){
			s+= "\n" + a[i].toString();
		}
		
		return s;
		
	}
	
	//SELECTION SORT
	public Pair[] selectionSort(){
		Pair[] newArr = new Pair[pSize];
		System.arraycopy(p, 0, newArr, 0, pSize);
		
		for(int i = 0; i<pSize-1; i++){
			int minPos = findMin(newArr, pSize, i);
			if(minPos != i){
				swap(newArr, i, minPos);
			}
		}
		
		return newArr;
	}
	
	private int findMin(Pair[] arr, int arrSize, int from){		
		int minPos = from;
		
		for(int i = from + 1 ; i<arrSize; i++){
			if((Double)(arr[i].getValue())<(Double)(arr[minPos].getValue())){
				minPos = i;
			}
		}
		
		return minPos;
	}
	
	private void swap(Object[] arr, int pos1, int pos2){
		Object temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
}