package Excep;
import java.io.*;

public class Fileex {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\saik4\\OneDrive\\Desktop\\abhi.txt");
		try {
		//if(file.createNewFile()) {
			FileWriter fw = new FileWriter(file);
			fw.write("This is fil writer");
			fw.close();
			System.out.println("file created");
		//}
		//else
			//System.out.println("file not created");
		}
		catch(Exception e) {
			System.out.println("I am catch");
		}
	}

}
