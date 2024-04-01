package LiskovSubtitution;

public class MockingBird implements FlyingBird, Bird {
	@Override
	public void makesAsound() {
		System.out.println(" Tiw Tiw :)");
	}

	@Override
	public void eats() {
		System.out.println(" The chicken eats fruit");
	}
}
