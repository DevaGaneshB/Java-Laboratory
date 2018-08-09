import java.applet.*;  
	import java.awt.*;  
	import java.awt.event.*;  
	
public class Exp208 extends Applet implements ActionListener{
	
	Button b;  
	  
	public void init(){  
	b=new Button("Click");  
	b.setBounds(50,50,60,50);  
	  
	add(b);  
	b.addActionListener(this);  
	}  
	  
	public void actionPerformed(ActionEvent e){  
	  
	Exp208 ctx=getAppletContext();  
	Applet a=ctx.getApplet("app2");  
	a.setBackground(Color.yellow);  
	}  
	
}
