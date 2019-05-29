package week1.day1;

public class Vehicle {
	String modelOfVehicle = "Audi";
	char logoFirstLetter = 'A';
	public void applyBrake() {
		System.out.println("Brake Applied");
	}
	public int getNoOfWheels(int wheelcount) {
		System.out.println("Wheel Count is:"+ wheelcount);
		return wheelcount;
	}
	public boolean isPunctured() {
		return false; 
	}
	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
		veh.applyBrake();
		veh.getNoOfWheels(4);
		boolean punctured = veh.isPunctured();
		System.out.println("Is Wheel Punctured:"+ punctured);
		//System.out.println("Is Wheel Punctured:"+veh.isPunctured());
	}
}

