import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Leggi3{
	public static void main(String[] args){
		try{
			FileReader r = new FileReader("input.txt");
			Scanner s = new Scanner(r);
			
			while(s.hasNextLine()){
				Scanner sLine = new Scanner(s.nextLine());
				
				sLine.useDelimiter("[,?\\s]+"); //separatori della stringa (+ indica che vengano ripetuti almeno una volta)
				
				while(sLine.hasNext()){
					System.out.println(sLine.next());
				}
				
				sLine.close();
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