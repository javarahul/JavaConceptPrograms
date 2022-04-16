package javaprograms;

public class PrintNumberByThreeThread {

	public static void main(String[] args) {
		PrintNumberByThreeThreadRunnable byThreeThreadRunnable1 = new PrintNumberByThreeThreadRunnable(1);
		PrintNumberByThreeThreadRunnable byThreeThreadRunnable2 = new PrintNumberByThreeThreadRunnable(2);
		PrintNumberByThreeThreadRunnable byThreeThreadRunnable3 = new PrintNumberByThreeThreadRunnable(0);

		Thread t1 = new Thread(byThreeThreadRunnable1);
		Thread t2 = new Thread(byThreeThreadRunnable2);
		Thread t3 = new Thread(byThreeThreadRunnable3);

		t1.start();
		t2.start();
		t3.start();
	}
}

class PrintNumberByThreeThreadRunnable implements Runnable {
	public int PRINT_NUMBERS_UPTO = 50;
	static int number = 1;
	int remainder;
	static Object lock = new Object();

	PrintNumberByThreeThreadRunnable(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		while (number < PRINT_NUMBERS_UPTO - 1) {
			synchronized (lock) {
				while (number % 3 != remainder) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(number + " ");
				number++;
				lock.notifyAll();
			}
		}
	}
}
