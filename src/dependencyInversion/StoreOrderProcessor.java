package dependencyInversion;

public class StoreOrderProcessor implements OrderProcessor {
    @Override
    public void processOrder(Order order) {
        System.out.println("Processing store order for " + order.getCustomerName());
        // Additional logic specific to store order processing
    }
}
