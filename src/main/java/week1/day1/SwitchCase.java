package week1.day1;

public class SwitchCase {
	public int noOfWheels(int count) {
		return count;
	}
	public static void main(String[] args) {
		//int vehicleType =2;
		SwitchCase switchh = new SwitchCase();
		int wheelCount1 = switchh.noOfWheels(10);
		switch(wheelCount1) {
		case 2:
			System.out.println("It is a two wheeler");
			break;

		case 4:
			System.out.println("It is a four wheeler");
			break;

		case 8:
			System.out.println("It is a heavy type vehicle");
			break;

		default:
			System.out.println("Not available");
			break;
		}
		
			
		}
	}
	


