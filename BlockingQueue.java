package javaprograms;

import java.util.LinkedList;
import java.util.List;

class BlockingQueue<E> {

	private List<E> queue = new LinkedList<E>();

	private int limit = 10;

	public BlockingQueue(int limit) {
		this.limit = limit;
	}

	public synchronized void enqueue(E item) throws InterruptedException {
		while (this.queue.size() == this.limit) {
			wait();
		}
		if (this.queue.size() == 0) {
			notifyAll();
		}
		this.queue.add(item);
	}

	public synchronized E dequeue() throws InterruptedException {
		while (this.queue.size() == 0) {
			wait();
		}
		if (this.queue.size() == this.limit) {
			notifyAll();
		}

		return this.queue.remove(0);
	}

	public static void main(String[] args) {
	}
}
