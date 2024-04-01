package LiskovSubtitution;

public class Owl implements FlyingBird {
	@Override
	public void eats() {
		System.out.println("The owl Eats : mice, rats, frogs...");
	}

	@Override
	public void makesAsound() {
		System.out.println(" Hoot, Hoot");
	}
}
