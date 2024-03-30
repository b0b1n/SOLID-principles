package SingleResponsibility;

public class SecurityService {

	public boolean canSendMoney(User user) {
		if(user.getBalance() > 0 && user.getRole() == Role.CAN_SEND) {
			return true;
		}else {
			return false;
		}
	}
}
