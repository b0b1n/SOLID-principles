package OpenClosed;

public class PersonalLoanHandler implements LoanHandler {
	private Validator validator;

	public PersonalLoanHandler(Validator validator) {
		this.validator = validator;
	}

	@Override
	public void approveLoan(User user) {
		if (validator.isValid(user)) {
			System.out.println(Validator.ANSI_GREEN + " WOHOOO!! the personal loan is valid" + Validator.ANSI_RESET);
		}
	}

}
