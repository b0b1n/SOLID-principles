package OpenClosed;

public class MortgageLoanValidator implements Validator {

	@Override
	public boolean isValid(User user) {
		System.out.println(Validator.ANSI_RED + "This user is always VALID for a mortgage LOAN" + Validator.ANSI_RESET
				+ " \uD83D\uDE09");
		return true;
	}

}
