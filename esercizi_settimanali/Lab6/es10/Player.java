import java.util.Random;

public class Player{
	String nome;
	int[] lanci;
	int punteggio;
	
	public Player(String aName){
		nome = aName;
		lanci = new int[3];
		punteggio = 0;
	}

	public String getName(){return nome;}
	public int getScore(){return punteggio;}

	//int n = (int)(a + (1+b-a)*Math.random()); [a, b]
	public void turno(){
		for(int i=0; i<3; i++){
			lanci[i] = (int)(1 + (6)*Math.random());
		}
	}
	
	public int[] sortDice(){
		int[] arr2 = new int[lanci.length];
		int sup;
		
		for(int i=0; i<lanci.length; i++){
			arr2[i] = lanci[i];
		}

		for(int i=0; i<arr2.length; i++){
			for(int j=i+1; j<arr2.length; j++){
				if(arr2[i]>arr2[j]){
					sup = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = sup;
				}				
			}
		}
		
		return arr2;
	}
	
	public void addPoint(){
		punteggio++;
	}
	
	public void resetScore(){
		punteggio=0;
	}
	
	public String toString(){
		String l = "";
		for(int i=0; i<lanci.length; i++){
			l+=Integer.toString(lanci[i]) + " ";
		}
		
		return "[" + getName() + "]\nLanci: " + l ;
	}
}