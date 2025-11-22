public class MyTris{

	private String[][] foglio;
	
	public MyTris(){
		foglio = new String[3][3];
		
		for(int i=0; i<foglio.length; i++){			
			for(int j=0; j<foglio[0].length; j++){
				foglio[i][j] = "...";
			}
		}	
	}
	
	public char getCharInPosition(int row, int column){
		if(!foglio[row][column].equals( "...")){
			return foglio[row][column].charAt(0);
		}else{
			return '.';
		}
	} 
	
	public int getCount(){
		int count=0;
		
		for(int i=0; i<foglio.length; i++){			
			for(int j=0; j<foglio[0].length; j++){
				if(getCharInPosition(i, j) != '.'){
					count++;
				}
			}
		}
		
		return count;
	}
	
	public boolean isWinning(char c){
		for(int i=0; i<foglio.length; i++){
			//controllo verticale e orizzontale
			if((foglio[i][0].charAt(0) == c && foglio[i][1].charAt(0) == c && foglio[i][2].charAt(0) == c) ||
			(foglio[0][i].charAt(0) == c && foglio[1][i].charAt(0) == c && foglio[2][i].charAt(0) == c)){
				return true;
			}
		}
		
		//controllo diagonali
		if((foglio[0][0].charAt(0) == c && foglio[1][1].charAt(0) == c && foglio[2][2].charAt(0) == c) ||
		(foglio[2][0].charAt(0) == c && foglio[1][1].charAt(0) == c && foglio[0][2].charAt(0) == c)){
			return true;
		}
		
		return false;
	}
	
	public boolean setCharInPosition(int row, int column, char c){
		if(getCharInPosition(row, column) == '.'){
			foglio[row][column] = c+"";
			return true;
		}else{
			return false;
		}
	}
	
	public String foglio(){
		String s = "";
		
		for(int i=0; i<foglio.length; i++){			
			for(int j=0; j<foglio[0].length; j++){
				if(foglio[i][j].equals("...")){
					s+= " [" + foglio[i][j] + "] ";
				}else{
					s+= "  [" + foglio[i][j] + "]  ";
				}
			}
			s+="\n";
		}
		
		return s;
	}
}