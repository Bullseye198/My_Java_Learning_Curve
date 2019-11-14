import java.util.*;
public class MartinCreateFile {

	public Formatter x;  //This will hold formatter object in variable named x
	
	public void openFile() {  //now we make a method to create and open file
		try {
			x = new Formatter("MartinVojkovic.txt");  //here we make a .txt file in x
		}
		catch (Exception e){
			System.out.println("Your have an error");
		}
	
	
	}
	public void addRecord() {  //here we add a record to our file
		x.format("%s%s%s", "27 ", "Martin ", "Vojkovic");
	}
	public void closeFile() {
		x.close();
	}
	public static void main (String [] args){
		MartinCreateFile g = new MartinCreateFile();
		g.openFile();
		g.addRecord();
		g.closeFile();
	}
}
