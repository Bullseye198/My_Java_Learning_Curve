	import java.io.PrintWriter;
	public class FileCreator {
	public static PrintWriter writer;

	public static void main (String [] args){
	
	try {writer = new PrintWriter("Croatian Sensation.txt");
	writer.println("Martin is the best programmer.");}
	catch (Exception e) {
		System.out.println("The error is" + e);
	}
	writer.close();
	}
	}