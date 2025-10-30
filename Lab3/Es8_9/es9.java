
public class es9{
	public static void main(String[] args){		
		MyRectangle r1 = new MyRectangle(1, 2, 3, 4);
		MyRectangle r2 = new MyRectangle(11, 22, 33, 44);
		
		System.out.println("[Rettangolo r1]");
		System.out.println(r1.toString());
		r1.resize(2);
		System.out.println(r1.toString());
		
		System.out.println("\n[Rettangolo r2]");
		System.out.println(r2.toString());
		r2.resize(0.5);
		System.out.println(r2.toString());
	}
}