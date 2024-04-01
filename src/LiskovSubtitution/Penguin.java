package LiskovSubtitution;

public class Penguin implements Bird {

	@Override
	public void eats() {
		System.out.println(" The penguin eats FISH");

	}

	@Override
	public void makesAsound() {
		System.out.println("Squawk Squawk");

	}

}
