package javaprograms;

import java.util.Scanner;

public class PrintNumbersByTwoThread {
	private static int N;
	private int counter = 1;

	private void printEvenNum() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(counter + " ");
				counter++;
				notify();
			}
		}
	}

	private void printOddNum() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(counter + " ");
				counter++;
				notify();
			}
		}
	}

	public static void main(String[] args) {
		PrintNumbersByTwoThread numbersByTwoThread = new PrintNumbersByTwoThread();

		System.out.println("Enter the limit number for printing");
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				numbersByTwoThread.printOddNum();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				numbersByTwoThread.printEvenNum();
			}
		});

		t1.start();
		t2.start();
	}
}
