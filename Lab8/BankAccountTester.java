import java.util.Scanner;

public class bankAccountTester{
	public static void main(String[] args){
		BankAccount a1 = new BankAccount("Int1");
		Scanner in = new Scanner(System.in);

		String operazione = " ";
		float x;
		
		do{
			System.out.println("Q | Quit: termina il programma");
			System.out.println("B | Balance: visualizza il saldo del conto");
			System.out.println("D x | Deposit: versa nel conto la somma x");
			System.out.println("W x | Withdraw: preleva dal conto la somma x");
			System.out.println("A x | Add interest: accredita sul conto gli interessi, calcolati in base alla percentuale x del saldo attuale (x deve essere positivo)");
			
			System.out.print("------------------\nComando: ");
			String line = in.nextLine();
			
			Scanner temp = new Scanner(line);
			
			if(temp.hasNext()){ //primo elemento della riga
				operazione = temp.next();
				
				if(operazione.length()==1){ //controllo sia un carattere
					operazione = operazione.toUpperCase();
					
					if(temp.hasNext()){ //secondo elemento della riga (c'è?)
						try{
							x = Float.parseFloat(temp.next()); 
							
							switch(operazione.charAt(0)){ 
								case 'D':
									if(a1.deposit(x)){
										System.out.println("Versamento effettuato: " + x);
									}else{
										System.out.println("Versamento non corretto");
									}
									break;							
								case 'W':
									if(a1.withdraw(x)){
										System.out.println("Prelievo effettuato: " + x);
									}else{
										System.out.println("Prelievo non autorizzato");
									}
									break;
								case 'A':
									float t = a1.accredita(x);
									if(t!=-1){
										System.out.println("Accredito effettuato: " + t);
									}else{
										System.out.println("Accredito non valido");
									}
									break;
							}
						}catch(NumberFormatException exc){
							//non fa nulla
						}
					}else{
						switch(operazione.charAt(0)){
							case 'Q':
								System.out.println("Arrivederci");
								System.exit(0);
								break;
							case 'B':
								System.out.println("Saldo: " + a1.getSaldo());
								break;
						}
					}
				}
			}
	
		}while(true);
	}
}