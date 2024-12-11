public class Car extends Vehicle {
	@Override
	public void start() {
		System.out.println("Car starting");
	}
	
	public void honk() {
		System.out.println("Car honking");
	}
}
