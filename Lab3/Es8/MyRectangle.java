public class MyRectangle{
	private double posX;
	private double posY;
	private double W;
	private double H;
	
	public MyRectangle(int x, int y, int w, int h){
		posX = x;
		posY = y;
		W = w;
		H = h;
	} 

	public double getPosX(){
		return posX;
	}
	
	public double getPosY(){
		return posY;
	}
	
	public double getW(){
		return W;
	}
	
	public double getH(){
		return H;
	}
	
	public void resize(double mult){
		posX = posX*mult;
		posY = posY*mult;
		H = H*mult;
		W = W*mult;
	}
	
	public void translate(double dx, double dy){
		posX += dx;
		posY += dy;
	}
	
	public String toString(){
		return "Rettangolo: " + "x=" + posX + "y=" + posY + ", w=" + W + ", h=" + H; 
	}
	
}