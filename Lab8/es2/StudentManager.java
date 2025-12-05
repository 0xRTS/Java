import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class StudentManager{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); 
		Student[] studenti = new Student[0];

		try{
			FileReader read = new FileReader("input.txt");
			Scanner file = new Scanner(read);	

			while(file.hasNextLine()){ //linea file
				Scanner line = new Scanner(file.nextLine()); //linea
				
				try{
					Student s = new Student(line.next(), Float.parseFloat(line.next()), Float.parseFloat(line.next())); //nuovo stud				
					studenti = newArr(studenti, s);
				}catch(NumberFormatException exc){
					System.exit(1);
				}
			}			
		}catch(FileNotFoundException exc){
			System.out.println("File not found.");
			System.exit(1);
		}
		
		boolean valid;
		
		do{
			System.out.println("Q | Quit");
			System.out.println("S | Student (info)");
			System.out.print("Comando: ");
			
			String c = in.next();
			valid = true;
			
			if(c.length()==1){
				if(c.charAt(0) == 'Q'){
					System.exit(0);
				}else if(c.charAt(0) == 'S'){
					System.out.print("Cognome studente: ");
					String cognome = in.next();
					
					float m = mediaStud(studenti, cognome);
					if(m == -1){
						System.out.println("Studente non trovato");
					}else{
						System.out.println("Media studente: " + m);
					}
				}else{
					valid = false;
				}
			}else{
				valid = false;
			}
			
			if(!valid){
				System.out.println("Comando non riconosciuto.");
			}
		}while(true);
	}
	
	public static float mediaStud(Student[] s, String cognome){ //cerca studente, ritorna eventualmente la media
		for(int i = 0; i<s.length; i++){
			if((s[i].getCognome()).equals(cognome)){
				return s[i].getMedia();
			}
		}
		
		return -1;
	}
	
	public static Student[] newArr(Student[] arr, Student s){ //ritorna array con l'aggiunta del nuovo elemento
		Student[] newArr = new Student[arr.length+1];
		
		for(int i = 0; i<arr.length; i++){
			newArr[i] = arr[i];
		}
		
		newArr[arr.length] = s;
		
		return newArr;
	}

}