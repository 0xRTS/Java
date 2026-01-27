public class Interruttore{
	static boolean statusLamp = false;
	private boolean status;
	
	public Interruttore(){
		status = false;
	} 
	
	public boolean getStatusInterruttore(){
		return status;
	}
	
	public boolean isBulbOn(){
		return statusLamp;
	}

	public void changeStatus(){
		status = !status;
		statusLamp = !statusLamp;
	}
	
	public String printStatus(){
		if(status){
			return "up";			
		}else{
			return "down";			
		}
	}
}