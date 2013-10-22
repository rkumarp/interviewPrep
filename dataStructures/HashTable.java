package dataStructures;


public class HashTable {
	
	private Item[] data;
	private int capacity;
	private int size;
	private static final Item AVAILABLE = new Item("Available", null);
	
	public HashTable(int capacity) {
		data = new Item[capacity];
		for(int i = 0; i < data.length; i++) {
			data[i] = AVAILABLE;
		}
		size = 0;
		this.capacity = capacity;
	}
	
	public int getIndex(String key) {
		return key.hashCode() % capacity;
	}
	
	public void insert(Item i) {
		size++;
		int index = this.getIndex(i.getKey());
		System.out.println(index);
		while(data[index] != AVAILABLE && data[index].getKey() != i.getKey()) {
			index = (index + 1) % capacity;
			System.out.println("enter");
		}
		data[index] = i;
	}
	
	public String toString() {
		String s = "<HashTable[";
		for(int i = 0; i < data.length; i++) {
			if(data[i] == AVAILABLE) {
				continue;
			}
			s += i + "*" + data[i].toString() + ",";
		}
		s = s.replaceAll(",$", "");
		s += "]>";
		return s;
	}
}

class Item {
	private String key;
	private Object element;
	
	public Item(String key, Object element) {
		this.setKey(key);
		this.setElement(element);
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public void setElement(Object element) {
		this.element = element;
	}
	
	public String getKey() {
		return key;
	}
	
	public Object getElement() {
		return element;
	}
	
	public String toString() {
		String  s = "<Item(";
		s += this.key + "," + this.element + ")>";
		return s;
	}
}

class Run {
	public static void main(String[] args) {
		HashTable ht = new HashTable(4);
		Item me = new Item("15", "a");
		Item you = new Item("2", "b");
		Item them = new Item("9", "c");
		Item us = new Item("4", "d");
		ht.insert(me);
		ht.insert(you);
		ht.insert(them);
		ht.insert(us);
		System.out.println(ht.toString());
	}
}
