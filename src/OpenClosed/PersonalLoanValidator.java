package OpenClosed;

public class PersonalLoanValidator implements Validator {

	@Override
	public boolean isValid(User user) {
		System.out.println(Validator.ANSI_BLUE+"This user is always VALID for a personal LOAN"+Validator.ANSI_RESET+" \uD83D\uDE09");
		return true;
	}

}
