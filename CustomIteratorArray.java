package javaprograms;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomIteratorArray<T> implements Iterable<T> {

	T[] values;

	public CustomIteratorArray(T[] values) {
		this.values = values;
	}

	@Override
	public Iterator<T> iterator() {
		return new ArrayIterator();
	}

	public T get(int index) {
		return values[index];
	}

	public void set(int index, T value) {
		values[index] = value;
	}

	public int length() {
		return values.length;
	}

	class ArrayIterator implements Iterator<T> {
		int currIndex = 0;

		@Override
		public boolean hasNext() {
			if (currIndex < values.length) {
				return true;
			}
			return false;
		}

		@Override
		public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			return values[currIndex++];
		}

		@Override
		public void remove() {
			if (currIndex > -1) {
				values[currIndex] = null;
			}
		}
		
		public T peek() {
			if (currIndex > -1) {
				return values[currIndex];
			}
			return null;
		}
	}

	public static void main(String[] args) {
		String[] strings = new String[] { "Hello", "World" };
		CustomIteratorArray<String> array = new CustomIteratorArray<String>(strings);

		array.set(1, "JavaRahul!");

		Iterator<String> iterator = array.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
