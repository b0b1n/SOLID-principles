package InterfaceSegregation;

public class Helicopter implements Drivable, Flyable {
	@Override
	public void drive() {
		System.out.println(" You can Drive this Helicopter");
	}

	@Override
	public void fly() {
		System.out.println(" You can fly this Helicopter");
	}
}
