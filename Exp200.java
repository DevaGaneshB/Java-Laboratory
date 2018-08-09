import java.awt.*;  
	import java.applet.*;  
	  
	  
public class Exp200 extends Applet{
	
	  
	  Image picture;  
	  
	  public void init() {  
	    picture = getImage(getDocumentBase(),"Download.jpg");  
	  }  
	    
	  public void paint(Graphics g) {  
	    g.drawImage(picture, 30,30, this);  
	  }  
	      
	 
}
