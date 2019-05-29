package PracticePgms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		method1();
		method2();
	}
	static String input = "MyFile.txt";
	public static void method1() throws IOException {
		FileWriter write = new FileWriter(input);
		BufferedWriter wr = new BufferedWriter(write);
		wr.write("Hello. How are you?");
		wr.newLine();
		wr.close();
	}
	public static void method2() throws IOException {
		FileWriter wr = new FileWriter(input, true);
		wr.write("Welcome to TestNG");
		wr.write("\r\n");
		wr.write("Bye");
		wr.close();
	}
}
