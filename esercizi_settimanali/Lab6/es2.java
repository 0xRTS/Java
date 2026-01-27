public class es2{
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("Non sono stati inseriti parametri");
		}else{
			for(int i = 0; i<args.length; i++){
				System.out.println(args[i]);
			}
		}
	}
}