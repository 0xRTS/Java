import java.util.Scanner;

public class es4{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int len = 3;
		int[] a = new int[len];
		int[] b = new int[len*2]; 
		int valuesSize = 0; 
		String num; 
		boolean f = false;
		
		while(!f){
			System.out.print("Inserire un numero: ");
			num = console.nextLine();
			
			if(num.equals("")){
				break;
			}else{
				if(valuesSize<a.length){
					a[valuesSize] = Integer.parseInt(num);
					valuesSize++;	
				}else{
					System.arraycopy(a, 0, b, 0, a.length); //copio a in b
					b[valuesSize] = Integer.parseInt(num);
					valuesSize++;	

					while(!f){
						System.out.print("Inserire un numero: ");
						num = console.nextLine();
						
						if(num.equals("")){
							f = true;
						}else{
							if(valuesSize<b.length){
								b[valuesSize] = Integer.parseInt(num);								
							}else{
								System.out.println("Numero massimo di valori inseriti");
								f = true;
							}
							
							valuesSize++;
						}
					}
				}
			}
		}
		
		if(valuesSize<=a.length){
			for(int i = valuesSize-1; i>=0; i--){
				System.out.println("a[" + i + "]: " + a[i]);
			}
		}else{
			for(int i = valuesSize-1; i>=0; i--){
				System.out.println("b[" + i + "]: " + b[i]);
			}
		}
	}
}