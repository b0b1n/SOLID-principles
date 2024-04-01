package LiskovSubtitution;

public interface FlyingBird extends Bird {
	default boolean canFly() {
		return true;
	}
}
