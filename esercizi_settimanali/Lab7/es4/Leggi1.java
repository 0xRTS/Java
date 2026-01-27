import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Leggi1{
	public static void main(String[] args){
		try{
			FileReader r = new FileReader("input.txt");
			Scanner s = new Scanner(r);
			
			while(s.hasNextLine()){
				System.out.println(s.nextLine());
			}
			
			try{
				r.close();
				s.close();
			}catch(IOException e){
				System.out.println("Errore");
			}
		}catch(FileNotFoundException e){
			System.out.println("Errore");
		}
	}
}