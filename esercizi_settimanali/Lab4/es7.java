import java.util.Scanner;

public class es7{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserire lato 1:");
		int l1 = in.nextInt();
		
		System.out.print("Inserire lato 2:");
		int l2 = in.nextInt();
		
		System.out.print("Inserire lato 3:");
		int l3 = in.nextInt();
		
		int max = Math.max(l3, Math.max(l1, l2)); //lato maggiore
		int sommaQuadrati=0;
		
		if(l3>=l1+l2 || l2>=l1+l3 || l1>=l3+l2){
			System.out.println("I lati inseriti non rappresentano un triangolo");
		}else{
			if(l1==l2 && l2==l3){
				System.out.println("Triangolo equilatero");
			}else{
				if(l1==l2 && l1!=l3 || l3==l2 && l1!=l3 || l1==l3 && l1!=l2){
					System.out.print("Triangolo isoscele");
				}else{
					System.out.print("Triangolo scaleno");
				}
				
				if(max==l1){
					sommaQuadrati = l2*l2+l3*l3;
				}else if(max==l2){
					sommaQuadrati = l1*l1+l3*l3;
				}else if(max==l3){
					sommaQuadrati = l1*l1+l2*l2;
				}
				
				if(max-sommaQuadrati>0){
					System.out.print(" ottusangolo");
				}else if(max-sommaQuadrati==0){
					System.out.print(" rettangolo");
				}else{
					System.out.print(" acutangolo");
				}
			}
		}

		in.close();		
	}
	
}