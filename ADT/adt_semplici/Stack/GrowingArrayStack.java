public class GrowingArrayStack extends FixedArrayStack{
	public void push(Object obj){
		if(vSize == v.length){
			v = resize(v);
		}
		
		super.push(obj);
	}
	
	private Object[] resize(Object[] arr){
		Object[] ret = new Object[2*arr.length];
		System.arraycopy(arr, 0, ret, 0, arr.length);
		return ret;
	}
}