package dependencyInversion;

public class OnlineOrderProcessor implements OrderProcessor {
	@Override
	public void processOrder(Order order) {
		System.out.println("Processing online order for " + order.getCustomerName());
	}
}
