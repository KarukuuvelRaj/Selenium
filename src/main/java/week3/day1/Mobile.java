package week3.day1;

public class Mobile {
	public void call() {
		System.out.println("Dialled caller");
	}
	public void sentSMS() {
		System.out.println("Message sent");
	}
	public static void main(String[] args) {
		/*Mobile obj = new Mobile();
		obj.sentSMS();
		Android obj1 = new Android();
		obj1.cameraQuality();
		obj1.videoQuality();*/
		Samsung object = new Samsung();
		object.call();
		object.videoQuality();
		object.cameraQuality();
	}
}
