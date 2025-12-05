public class Student{
	private String cognome;
	private float scritto;
	private float orale;
	
	public Student(String cognome, float scritto, float orale){
		this.cognome = cognome;
		this.scritto = scritto;
		this.orale = orale;
	}
	
	public String getCognome(){return cognome;}
	public float getScritto(){return scritto;}
	public float getOrale(){return orale;}
	
	public float getMedia(){return (scritto+orale)/2;}
}