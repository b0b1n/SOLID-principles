package dependencyInversion;

public class DependencyInversionPrincipleDemo {
	public static void main(String[] args) {
		Order order = new Order("Sohaib Skious");

		// Configure the dependency injection
		OrderProcessor onlineProcessor = new OnlineOrderProcessor();
		OrderService service = new OrderService(onlineProcessor);

		// Process the order
		service.process(order);
	}
}
