import java.util.Scanner;

public class Risiko{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		
		System.out.print("Inserire nome giocatore 1: ");
		Player p1 = new Player(console.nextLine());
		
		System.out.print("Inserire nome giocatore 2: ");
		Player p2 = new Player(console.nextLine());
		
		System.out.println();

		p1.turno();
		p2.turno();
		
		System.out.println(p1.toString());
	
		System.out.println();
		
		System.out.println(p2.toString());
		
		int[] arrP1 = new int[3];
		arrP1 = p1.sortDice();		
		
		int[] arrP2 = new int[3];
		arrP2 = p2.sortDice();
		
		System.out.println("\n-----------------------\n");
		
		System.out.print("[" + p1.getName() + "]\nLanci: ");
		for(int i=0; i<arrP1.length; i++){
			System.out.print(arrP1[i] + " ");
		}
		
		System.out.println("\n");
		
		System.out.print("[" + p2.getName() + "]\nLanci: ");
		for(int i=0; i<arrP2.length; i++){
			System.out.print(arrP2[i] + " ");
		}
		
		System.out.println("\n-----------------------\n");

		for(int i=0; i<3; i++){
			if(arrP1[i]>arrP2[i]){
				p1.addPoint();
			}else{
				p2.addPoint();
			}
		}
		
		System.out.println(vincitore(p1, p2));
		
	}
	
	public static String vincitore(Player P1, Player P2){
		if(P1.getScore()>P2.getScore()){
			return "Vincitore: " + P1.getName() + "\nPunteggio: " + P1.getScore();
		}else{
			return "Vincitore: " + P2.getName() + "\nPunteggio: " + P2.getScore();
		}
	}
}