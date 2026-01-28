public class FixedArrayStack implements Stack{
	protected Object[] v;
	protected int vSize;
	
	public FixedArrayStack(){
		v = new Object[10];
		
		makeEmpty();
	}
	
	public void push(Object obj){
		if(vSize==v.length){
			throw new FullStackException();
		}else{
			v[vSize] = obj;
			vSize++;
		}
	}
	
	public Object top(){
		if(isEmpty()){
			throw new EmptyStackException();
		}else{
			return v[vSize-1];
		}
		
	}
	public Object pop(){
		Object obj = top();
		vSize--;
		return obj;
	}
	
	public void makeEmpty(){
		vSize=0;
	}

	public boolean isEmpty(){
		return (vSize==0);
	}
}