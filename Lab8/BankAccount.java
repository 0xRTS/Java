public class BankAccount{
	private String intestatario; 
	private static int accounts =1;
	private int numeroAccount; 
	private float saldo;

	public BankAccount(String intestatario){
		numeroAccount=accounts;
		accounts++;
		this.intestatario = intestatario;
		saldo = 0;
	}
	
	public float getSaldo(){return saldo;}
	public int getNumeroAccount(){return numeroAccount;}
	public String getIntestatario(){return intestatario;}
	public static int getAccounts(){return accounts;}
	
	public boolean withdraw(float w){
		if(saldo<w){
			return false;
		}else{
			saldo-=w;
			return true;
		}
	}
	
	public boolean deposit(float d){
		if(d<=0){
			return false;
		}else{
			saldo+=d;
			return true;
		}
	}
	
	public float accredita(float x){
		if(x<=0){
			return -1;
		}else{
			float acc = (saldo/100)*x;
			saldo-=acc;
			return acc;
		}
	}
	
}