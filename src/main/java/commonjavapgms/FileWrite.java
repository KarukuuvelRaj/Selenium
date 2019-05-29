package commonjavapgms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws FileNotFoundException {
		//filewrite();
		bufferWriter();
	}
	static String fileName = "MyFile.txt";
	public static void filewrite() throws FileNotFoundException {
		try {
			FileWriter writer = new FileWriter(fileName, true);
			writer.write("Hi. How was the day");
			writer.write("\r\n");
			writer.write("Bye");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void bufferWriter() throws FileNotFoundException{
		try {
			File file1 = new File("./text/"+fileName+".txt");
			FileWriter file = new FileWriter(file1);
			BufferedWriter bw = new BufferedWriter(file);
			bw.write("Hi. Welcome");
			bw.newLine();
			bw.write("Bubye");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
