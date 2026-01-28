public class ArrayMap implements Map{
	private Pair[] p;
	private pSize;
	private static final int CAPACITY = 1;
	
   public ArrayMap(){
		p = new Pair[CAPACITY];
		makeEmpty();
	}
	
	public Object[] keys(){
		Object[] ret = new Object[pSize];
		
		for(int i = 0; i<pSize: i++){
			ret[i] = p[i].getKey();
		}
		
		return ret;
	}
	
	public Object get(Object k){
		for(int i = 0; i<pSize; i++){
			if(p[i].getKey().equals(k)){
				return p[i].getValue();
			}
		}
		
		return null;
	}
	
	public Object put(Object k, Object v){ 
		if(key==null || v ==null){
			throw new IllegalArgumentException();
		}
		
		if(pSize == p.length){
			p = resize(p);
		}
		
		Object old = remove(k); //null oppure obj
		
		p[pSize++] = new Pair(k, v); //l'incremento avviene dopo
		
		return old;
	}
	
	public Object remove(Object key){
		for(int i = 0; i<pSize; i++){
			if(p[i].getKey().equals(key)){ //sistemo il "buco" inserendovi l'ultimo elemento
				Object obj = p[i].getValue();
				p[i] = p[pSize-1];
				pSize--;
				
				return obj;
			}
		}
		
		return null;
	}
	
	public Object[] resize(Object[] arr){ 
		Object[] copy = new Object[2*arr.length];
		System.arraycopy(arr, 0, copy, 0, arr.length);
		return copy;
	}
	
	public int size(){
		return pSize;
	}
	
	private class Pair{ //coppia chiave+valore
		private Object key;
		private Object value;
		
		public Pair(Object k, Object v){
			setKey(k);
			setvalue(v);
		}
		
		public void setKey(Object k){
			key = k;
		}
		
		public void setvalue(Object v){
			value = v;
		}
		
		public Object getKey(){
			return key;
		}
	
		public Object getValue(){
			return value;
		}
	}
	
	public void makeEmpty(){
		pSize = 0;
	}
	
	public boolean isEmpty(){
		return (pSize == 0);
	}
} 