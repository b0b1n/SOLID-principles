package InterfaceSegregation;

public class SubMarine implements Drivable, Divable {

	@Override
	public void dive() {
		System.out.println(" You can dive into the ocean");
	}

	@Override
	public void drive() {
		System.out.println(" You can drive the submarine");
	}

}
