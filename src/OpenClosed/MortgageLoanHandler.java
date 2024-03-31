package OpenClosed;

public class MortgageLoanHandler implements LoanHandler {

	private Validator validator;
	public MortgageLoanHandler(Validator validator) {
		this.validator = validator;
	}

	@Override
	public void approveLoan(User user) {
		if(validator.isValid(user)) {
			System.out.println(Validator.ANSI_GREEN+" WOHOOO!! the mortgage loan is valid"+Validator.ANSI_RESET);
		}
	}

}
