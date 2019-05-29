package commonjavapgms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws IOException {
		fileread();
		//read();
	}
	static String fileName = "MyFile.txt";
	public static void fileread() throws IOException {
		String line=null;
		File file = new File("./text/"+fileName+".txt");
		FileReader read = new FileReader(file);
		BufferedReader br = new BufferedReader(read);
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
	public static void read() throws FileNotFoundException {
		File file = new File(fileName);
		//File file = new File("./text/"+fileName+".txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine())
			System.out.println(sc.hasNextLine());
		sc.close();
	}
}
