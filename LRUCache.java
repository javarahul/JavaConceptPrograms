package javaprograms;

import java.util.HashMap;

public class LRUCache {

	class Node {
		int key;
		int value;
		Node prev;
		Node next;
	}

	private HashMap<Integer, Node> cache = new HashMap<>();
	private int count;
	private int capacity;
	private Node head;
	private Node tail;

	public LRUCache(int capacity) {
		count = 0;
		this.capacity = capacity;

		head = new Node();
		head.prev = null;

		tail = new Node();
		tail.next = null;

		head.next = tail;
		tail.prev = head;
	}

	private void addNode(Node node) {
		node.prev = head;
		node.next = head.next;

		head.next.prev = node;
		head.next = node;
	}

	private void remove(Node node) {
		Node prev = node.prev;
		Node next = node.next;

		prev.next = next;
		next.prev = prev;
	}

	private void moveToHead(Node node) {
		remove(node);
		addNode(node);
	}

	private Node popTail() {
		Node lastNode = tail.prev;
		remove(lastNode);
		return lastNode;
	}

	public int get(int key) {
		Node node = cache.get(key);
		if (node == null) {
			return -1;
		}
		moveToHead(node);
		return node.value;
	}

	public void put(int key, int value) {
		Node node = cache.get(key);
		if (node == null) {
			Node newNode = new Node();
			newNode.key = key;
			newNode.value = value;

			if (count == capacity) {
				Node tail = popTail();
				cache.remove(tail.key);
				--count;
			}

			count++;
			cache.put(key, newNode);
			addNode(newNode);
		} else {
			node.value = value;
			moveToHead(node);
		}
	}

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.put(1, 1);
		cache.put(2, 2);
		int val = cache.get(1);

		System.out.println(val);
	}

}
