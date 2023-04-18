package observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
	private List<Observer> customers;
	private String productName;
	private String productType;
	private String productPrice;
	private String availability;

	public Product(String productName, String productType, String productPrice, String availability) {
		customers = new ArrayList<Observer>();
		this.productName = productName;
		this.productType = productType;
		this.productPrice = productPrice;
		this.availability = availability;
	}

	@Override
	public void addObservers(Observer observer) {
		customers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		customers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		System.out.println("Product Name :" + this.productName + ", Product Type :" + this.productType
				+ ", Product Price :" + this.productPrice + " is available now. So notifying all the users");
		for (Observer observer : customers) {
			observer.update(this.availability);
		}
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		System.out.println("Availability changed from Not Available to Available");
		notifyObservers();
	}

}
