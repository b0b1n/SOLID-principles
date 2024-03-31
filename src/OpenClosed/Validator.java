package OpenClosed;

public interface Validator {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_BLUE ="\u001B[34m";
	public static final String ANSI_GREEN = "\u001B[32m";
	boolean isValid(User user);
}
