//Java Serialization
import java.io.Serializable;
import java.io.*;  
import java.io.FileOutputStream;  
public class Exp160 implements Serializable{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int id;
 String name;
 public Exp160(int id, String name) {
  this.id = id;
  this.name = name;
 }

	  
	
		 public static void main(String args[])throws Exception{  
			 Exp160 s1 =new Exp160(211,"ravi");  
		  
		  FileOutputStream fout=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		  out.writeObject(s1);  
		  out.flush();  
	  System.out.println("success");  
	  out.close();
	  

}
}
