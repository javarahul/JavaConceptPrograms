package javaprograms;

import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPoolExecutor {
	private final LinkedBlockingQueue<Runnable> workerQueue;
	private final Thread[] workerThreads;

	public CustomThreadPoolExecutor(int numThreads) {
		workerQueue = new LinkedBlockingQueue<>();
		workerThreads = new Thread[numThreads];

		int i = 0;

		for (Thread t : workerThreads) {
			t = new Worker("Custom Pool Thread " + ++i);
			t.start();
		}
	}

	public void addTask(Runnable r) {
		try {
			workerQueue.put(r);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	class Worker extends Thread {
		public Worker(String name) {
			super(name);
		}

		@Override
		public void run() {
			while (true) {
				try {
					workerQueue.take().run();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (RuntimeException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		CustomThreadPoolExecutor threadPoolExecutor = new CustomThreadPoolExecutor(10);
		threadPoolExecutor.addTask(new Runnable() {

			@Override
			public void run() {
				System.out.println("First print task");
			}
		});
		threadPoolExecutor.addTask(new Runnable() {

			@Override
			public void run() {
				System.out.println("Second print task");
			}
		});
		threadPoolExecutor.addTask(new Runnable() {

			@Override
			public void run() {
				System.out.println("Third print task");
			}
		});
	}
}
