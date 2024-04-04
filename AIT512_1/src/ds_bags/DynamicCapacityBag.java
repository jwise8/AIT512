/**
 * 
 */
package ds_bags;

import java.util.Iterator;

/**
 *
 * @author Jeffrey Wise
 */
public class DynamicCapacityBag<Item> implements Bag<Item> {
	
	/**
	 * the array of elements stored in the bag
	 */
	private Item[] elements;

	/**
	 * the current number of elements stored in the bag.
	 */
	private int numberOfElements;

	/**
	 * creates a bag with the specified initial capacity
	 * @param initialCapacity The initial capacity of the bag.
	 */
	@SuppressWarnings("unchecked")
	public DynamicCapacityBag(int initialCapacity) {
		elements = (Item[]) new Object[initialCapacity];
		numberOfElements = 0;
	}

	/**
	 * Double the capacity of the current bag.
	 */
	private void doubleCapacity() {
		@SuppressWarnings("unchecked")
		Item[] newElements = (Item[])new Object[elements.length*2];
		for (int i=0; i<elements.length; i++){
			newElements[i] = elements[i];
		}
		elements = newElements;
	}
    
	@Override
	public void add(Item item) {
		if (numberOfElements==elements.length)
			doubleCapacity();
		elements[numberOfElements++]=item;
	}

	
	@Override
	public int size() {
		return numberOfElements;
	}
	
	@Override
	public Iterator<Item> iterator() {
		return new Iterator<Item>() {
			int index =0;
			
			@Override
			public boolean hasNext() {
				return index<numberOfElements;
			}
			
			@Override
			public Item next() {
				if (hasNext()) return elements[index++];
				throw new RuntimeException("No more elements.");
			}
		};
	}

	@Override
	public String toString() {
		String result = "[";
		String separator="";
		for (int i=0; i<numberOfElements; i++) {
			result += separator + elements[i].toString();
			separator = " ";
		}
		result+="]";
		return result;
	}
}
	