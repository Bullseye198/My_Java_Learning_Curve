import java.util.*;
public class MartinCreateFile {

	public Formatter formatter;  //This will hold formatter object in variable named x
	
	public void openFile() {  //now we make a method to create and open file
		try {
			formatter = new Formatter("MartinVojkovic.txt");  //here we make a .txt file in x
		}catch (Exception e){
			System.out.println("Unable to create File");
			System.out.println(e);
		}
	}
	
	public void addRecord() {  //here we add a record to our file
		formatter.format("%s%s%s", "27 ", "Martin ", "Vojkovic");
	}
	
	public void closeFile() {
		formatter.close();
	}
	
	public static void main (String [] args){
		MartinCreateFile g = new MartinCreateFile(); #this cannot work 
		g.openFile(); #does it work ?
		g.addRecord(); #how tf does it work?
		g.closeFile(); #MartinCreateFile is name of your class not method 
	}
}
