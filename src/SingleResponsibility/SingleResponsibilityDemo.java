package SingleResponsibility;

public class SingleResponsibilityDemo {

	public static void main(String[] args) {
		MailBoxSettingsService mailBoxSettingsService = new MailBoxSettingsService();
		User myUser = new User("SohaibSkious", "exemple1@company.com", 3600);

		// Responsibility #1 of MailBoxSettingsService - change Settings in mailBox
		mailBoxSettingsService.changeSecondaryMail(myUser, "exemple2@gmail.com");
		
		// Responsibility #1 of SecurityService - verify Access
		
		SecurityService securityService = new SecurityService();
		if(securityService.canSendMoney(myUser)) {
			myUser.sendMoney(new User(), 420);
		}
		
	}

}
