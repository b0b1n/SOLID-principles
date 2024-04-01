package InterfaceSegregation;

public class Car implements Drivable {

	@Override
	public void drive() {
		System.out.println(" You can drive");
	}

}
