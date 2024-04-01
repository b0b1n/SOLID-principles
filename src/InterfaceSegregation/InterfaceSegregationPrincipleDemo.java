package InterfaceSegregation;

public class InterfaceSegregationPrincipleDemo {

	public static void main(String[] args) {
		Flyable fedewFedew = new Helicopter();
		Drivable helicopter = new Helicopter();
		
		fedewFedew.fly();
		helicopter.drive();
		System.gc();
	}

}
