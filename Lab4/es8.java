import java.util.Scanner;

public class es8{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		
		System.out.println("Inserire compleanno (giorno mese): ");
		
		String data = console.nextLine();
		int giorno = Integer.parseInt(data.substring(0, data.indexOf(' ')));
		int mese = Integer.parseInt(data.substring(data.indexOf(' ')+1));
		
		String oroscopo="";
		if ((mese == 3 && giorno >= 21) || (mese == 4 && giorno <= 19)) {
            oroscopo = "ARIETE  (da 21 3 a 19 4)\nAmore: 4/5\nAmicizia: 3/5\nLavoro: 5/5";
        } else if ((mese == 4 && giorno >= 20) || (mese == 5 && giorno <= 20)) {
            oroscopo = "TORO  (da 20 4 a 20 5)\nAmore: 4/5\nAmicizia: 4/5\nLavoro: 4/5";
        } else if ((mese == 5 && giorno >= 21) || (mese == 6 && giorno <= 20)) {
            oroscopo = "GEMELLI  (da 21 5 a 20 6)\nAmore: 3/5\nAmicizia: 5/5\nLavoro: 4/5";
        } else if ((mese == 6 && giorno >= 21) || (mese == 7 && giorno <= 22)) {
            oroscopo = "CANCRO  (da 21 6 a 22 7)\nAmore: 5/5\nAmicizia: 4/5\nLavoro: 3/5";
        } else if ((mese == 7 && giorno >= 23) || (mese == 8 && giorno <= 22)) {
            oroscopo = "LEONE  (da 23 7 a 22 8)\nAmore: 4/5\nAmicizia: 3/5\nLavoro: 4/5";
        } else if ((mese == 8 && giorno >= 23) || (mese == 9 && giorno <= 22)) {
            oroscopo = "VERGINE  (da 23 8 a 22 9)\nAmore: 3/5\nAmicizia: 4/5\nLavoro: 5/5";
        } else if ((mese == 9 && giorno >= 23) || (mese == 10 && giorno <= 22)) {
            oroscopo = "BILANCIA  (da 23 9 a 22 10)\nAmore: 4/5\nAmicizia: 5/5\nLavoro: 4/5";
        } else if ((mese == 10 && giorno >= 23) || (mese == 11 && giorno <= 21)) {
            oroscopo = "SCORPIONE  (da 23 10 a 21 11)\nAmore: 5/5\nAmicizia: 3/5\nLavoro: 4/5";
        } else if ((mese == 11 && giorno >= 22) || (mese == 12 && giorno <= 21)) {
            oroscopo = "SAGITTARIO  (da 22 11 a 21 12)\nAmore: 4/5\nAmicizia: 5/5\nLavoro: 3/5";
        } else if ((mese == 12 && giorno >= 22) || (mese == 1 && giorno <= 19)) {
            oroscopo = "CAPRICORNO  (da 22 12 a 19 1)\nAmore: 3/5\nAmicizia: 4/5\nLavoro: 5/5";
        } else if ((mese == 1 && giorno >= 20) || (mese == 2 && giorno <= 18)) {
            oroscopo = "ACQUARIO  (da 20 1 a 18 2)\nAmore: 4/5\nAmicizia: 4/5\nLavoro: 4/5";
        } else if ((mese == 2 && giorno >= 19) || (mese == 3 && giorno <= 20)) {
            oroscopo = "PESCI  (da da 19 2 a 20 3)\nAmore: 5/5\nAmicizia: 4/5\nLavoro: 3/5";
        } else {
            oroscopo = "Data non valida!";
        }

		System.out.println("\n" + oroscopo);
		console.close();

	}

}