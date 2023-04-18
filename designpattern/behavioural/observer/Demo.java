package observer;

public class Demo {

	public static void main(String[] args) {
		Product samsungLEDTV = new Product("Samsung LED TV", "LED TV", "60000 Rs", "Not available");
		Customer david = new Customer("David", samsungLEDTV);
		Customer john = new Customer("John", samsungLEDTV);
		samsungLEDTV.setAvailability("Available");
	}

}
