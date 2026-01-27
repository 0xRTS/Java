import java.util.Scanner;

public class es9{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		boolean decision = false;
		int row;
		int column;
		boolean invalidPos;
		boolean gameOver = false;
		
		do{
			MyTris tris = new MyTris();
					
			for(int i=0; i<9; i++){
				do{
					invalidPos = false;
					
					System.out.println('\n' + tris.foglio());

					System.out.print("Inserire coordinate X (row):");
					row = console.nextInt();
					
					System.out.print("Inserire coordinate X (column):");
					column = console.nextInt();
					
					if(tris.getCharInPosition(row, column) != '.'){
						invalidPos = true;
						System.out.println("Casella già occupata");
					}else if(row <0 || row > 2 || column <0 || column > 2){
						invalidPos = true;
						System.out.println("Coordinate casella inesistenti");
					}else{
						tris.setCharInPosition(row, column, 'X');	
					}
				}while(invalidPos);			

				if(tris.isWinning('X')){
					System.out.println("Il vincitore è X");
					i = 10;
				}else{
					do{
						invalidPos = false;
						
						System.out.println('\n' + tris.foglio());

						System.out.print("Inserire coordinate O (row):");
						row = console.nextInt();
						
						System.out.print("Inserire coordinate O (column):");
						column = console.nextInt();
						
						if(tris.getCharInPosition(row, column) != '.'){
							invalidPos = true;
							System.out.println("Casella già occupata");
						}else if(row <0 || row > 2 || column <0 || column > 2){
							invalidPos = true;
							System.out.println("Coordinate casella inesistenti");
						}else{
							tris.setCharInPosition(row, column, 'O');	
						}
					}while(invalidPos);		

					if(tris.isWinning('O')){
						System.out.println("Il vincitore è O");
						i = 10;
					}			
				}		
			}

			console.nextLine();
			String line;
			
			do{
				System.out.print("Giocare ancora (Y/N)? ");
				line = console.nextLine();
			}while(!line.equals("Y") && !line.equals("N"));
			
			if(line.equals("Y")){
				decision = true;
			}else if(line.equals("N")){
				decision = false;
			}
			
		}while(decision);

		console.close();
	}
}