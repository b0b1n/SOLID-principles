package OpenClosed;

public class OpenClosedPrincipleDemo {

	public static void main(String[] args) {
		User user = new User();
		System.out.println("--------");
		LoanHandler loanHandler1 = new PersonalLoanHandler(new PersonalLoanValidator());
		loanHandler1.approveLoan(user);
		System.out.println("--------");
		LoanHandler loanHandler2 = new MortgageLoanHandler(new MortgageLoanValidator());
		loanHandler2.approveLoan(user);
		System.out.println("--------");
	
	}

}
