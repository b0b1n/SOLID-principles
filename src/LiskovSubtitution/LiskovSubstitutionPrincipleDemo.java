package LiskovSubtitution;

public class LiskovSubstitutionPrincipleDemo {

	public static void main(String[] args) {
		Bird[] birds = {new Chicken(), new MockingBird(), new Penguin(), new Owl()};
		for(Bird bird : birds) {
			System.out.println(" --> "+ bird.getClass().getSimpleName());
			if (bird instanceof FlyingBird) {
				System.out.println(" ******* Can Fly");
			}
				System.out.print(" ******* What it eats : ");
				bird.eats();
				System.out.print(" ******* Makes the sound :");
				bird.makesAsound();
		}
	
	}

}
