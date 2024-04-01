package LiskovSubtitution;

public class Chicken implements Bird {

	@Override
	public void makesAsound() {
		System.out.println(" CoCOOOOO");
	}

	@Override
	public void eats() {
		System.out.println(" The chicken eats seeds");
	}

}
