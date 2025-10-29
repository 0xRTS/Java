import java.util.Scanner;

public class es{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("Inserire valori: \n");
			double somma = 0.0;
			double value1 = input.nextDouble();
			double value2 = input.nextDouble();
			double value3 = input.nextDouble();
			
			somma = value1 + value2 + value3;
			
			System.out.print(value1 + "\n" + value2 + "\n" + value3 + "\n" + somma);
			System.out.print(value1 + "\n" + value2 + "\n" + value3 + "\n" + somma);
			
			input.close();
	}
}