package commonjavapgms;
public class EliminateChar {
	public static void main(String[] args) {
		String input = "Welcome to Automation World";
		if(input.contains("o")){
			String replaceAll = input.toLowerCase().replaceAll("o", "");
			//String replaceAll = input.replaceAll("o", "");
			System.out.println(replaceAll);
		}
	}	 
}