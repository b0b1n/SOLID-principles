package dependencyInversion;

public class OrderService {
    private OrderProcessor orderProcessor;

    public OrderService(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    public void process(Order order) {
        orderProcessor.processOrder(order);
    }
}

