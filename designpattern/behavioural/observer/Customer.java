package observer;

public class Customer implements Observer {
	private String customerName;

	public Customer(String customerName, Subject subject) {
		this.customerName = customerName;
		subject.addObservers(this);
	}

	@Override
	public void update(String availability) {
		System.out.println("Hello " + this.customerName + ", Product is now " + availability + " on flipkart");
	}

}
