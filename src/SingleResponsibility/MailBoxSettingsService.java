package SingleResponsibility;

public class MailBoxSettingsService {
	private SecurityService securityService;
	{
		securityService = new SecurityService();
	}
	public void changeSecondaryMail(User user, String newSecondaryEmail) {
		if(securityService.canSendMoney(user) && !newSecondaryEmail.isEmpty()) {
			user.setSecondaryEmail(newSecondaryEmail);
		}

	}
}
