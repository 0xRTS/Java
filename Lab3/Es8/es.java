
public class es{
	public static void main(String[] args){		
		MyRectangle r = new MyRectangle(1, 2, 3, 4);
		
		System.out.println(r.toString());
		
		r.resize(0.5);
	
		System.out.println(r.toString());
	}
}