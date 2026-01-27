import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MakeBlackWhiteImage {
	public static void main(String args[])throws IOException {
		if (args.length != 2){
			 System.out.println("Usage: java DecodeImage inputFileName outputFileName");
			 System.exit(0);
		}
		  
		//Creo oggetto SimpleImage con l'immagine di input
		SimpleImage img = new SimpleImage(args[0]);
		 
		// ricordarsi che le immagini sono griglie di pixel
		// l'asse x e' la larghezza
		// l'asse y l'altezza
		// (0,0) e' l'angolo in alto a sinistra
		
		int value = 128; //valore di soglia da cui dipende l'immagine 
		//(value + alto -> img più scura)
		//(value + basso -> img più chiara)
		
		int newValue;
		
		//per ogni pixel in posizione x,y
		for(int x = 0; x<img.width(); x++){
			for(int y = 0; y<img.height(); y++){
				
            // Acquisisco il colore del pixel e lo salvo
            // in una var. riferimento a un oggetto Color           
            Color c = img.get(x,y); 

            //Acquisisco i singoli colori e li salvo in varibili int
			int red = c.getRed();
			int green = c.getGreen();
			int blue = c.getBlue();

			int media = (red + green + blue)/3;
			
            if(media>value){
				newValue = 255; //bianco
			}else{
				newValue = 0; //nero
			}

            //Creo un nuovo colore con questi valori RGB
            c = new Color(newValue, newValue, newValue);
            
            //Metto il nuovo colore nell'immagine in pos (x,y)
            img.set(x, y, c);
			}  
		}      
		
		//Saving the modified image
		img.save(args[1]);
        System.out.println("Done...");
	}
}