package OpenClosed;

import java.util.Date;

public class User {
	private String userName;
	private String email;
	private String secondaryEmail;
	private int balance;

	public User() {
		userName = "user" + new Date().getDate();
		this.balance = 1000;
	}

	public User(String userName, String email, int balance) {
		super();
		this.userName = userName;
		this.email = email;
		this.balance = balance;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String newSecondaryEmail) {
		this.secondaryEmail = newSecondaryEmail;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void sendMoney(User user, int i) {
		if (user.balance - i > 0) {
			user.balance += i;
			this.balance -= i;
			System.out.println(" ----- ");
			System.out.println("Transaction Completed :: ");
			System.out.println(" user : " + userName + " is with a balance now of : " + balance);
			System.out.println(" user : " + user.userName + " is with a balance now of : " + user.getBalance());
			System.out.println(" ----- ");
		} else {
			System.out.println(" ----- ");
			System.out.println(" The user [ " + userName + " ] can't send money to [" + user.getUserName() + "]");
			System.out.println(" --> Cause ::  Not enough balance. ");
			System.out.println(" ----- ");
		}

	}

}
