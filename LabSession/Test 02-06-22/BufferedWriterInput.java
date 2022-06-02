package corejava;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterInput {

	public static void main(String[] args) {
		try { FileWriter writer = new FileWriter("names.txt"); 
		BufferedWriter bwr = new BufferedWriter(writer);
		bwr.write("Aditya"); bwr.write("\n"); bwr.write("Shetty");
		bwr.close(); System.out.println("succesfully written to a file");
		} catch (IOException ioe) { ioe.printStackTrace();
		}
	

	}

}
