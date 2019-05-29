package PracticePgms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Fileread {

	public static void main(String[] args) throws IOException {
		method1();
	}
	static String fileName = "Myfile.txt";
	static String input = null;
	public static void method1() throws IOException {
		FileReader read = new FileReader(fileName);
		BufferedReader br = new BufferedReader(read);
		while((input=br.readLine())!=null) {
			System.out.println(input);
		}	
		br.close();
	}
	public static void method2() throws FileNotFoundException {
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.hasNextLine());
			sc.close();
		}
	}
}
