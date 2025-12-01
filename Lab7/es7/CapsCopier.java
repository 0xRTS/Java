import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CapsCopier{
	public static void main(String[] args){
		try{
			FileReader r = new FileReader("input.txt");
			PrintWriter p = new PrintWriter("output.txt");
			
			Scanner s = new Scanner(r);
			
			while(s.hasNextLine()){
				Scanner sLine = new Scanner(s.nextLine());
												
				while(sLine.hasNext()){
					String str = sLine.next();
					p.print(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase() + " ");
				}
				
				p.println(); //per ogni riga letta vado poi a capo
				sLine.close();
			}
			
			try{
				r.close();
				p.close();
				s.close();
			}catch(IOException e){
				System.out.println("Errore");
			}
		}catch(FileNotFoundException e){
			System.out.println("Errore");
		}
	}
}