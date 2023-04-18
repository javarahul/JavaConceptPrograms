package observer;

public interface Subject {
	public void addObservers(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();
}
