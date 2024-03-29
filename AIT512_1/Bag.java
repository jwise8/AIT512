/**
 * 
 */
package ds_bags;

/**
 * @author zap83
 * @param Item
 */
public interface Bag<Item> extends Iterable<Item> {

	default boolean isSingleton () {
		return this.size ()== 1;
	}
	/**
	 * adds item to the bag. duplicate allowed
	 * @param item
	 */
	public void add(Item item);
	
	/**
	 * check if the bag is has a single element - has size one.
	 * @return true for an bag has single element. 
	 */
	default boolean isEmpty() {
	return this.size ()== 0;		
	}
	/**
	 * the number of elements in a bag is named the size of the bag. 
	 * @return the size of the bag
	 * 
	 */
	public int size();
	
	/**
	 * creates a string representation of the bag, starting with the start string, ending with the end string
	 * and separating the items with the separator.
	 * @param start - including at the beginning
	 * @param end - included at the end
	 * @param separator - included between elements
	 * @return the generated String
	 */
	default public String toString(String start, String end, String separator) {
		String result = start;
		boolean needSeparator = false;
		for (Item item: this) {
			if (needSeparator) {
				result += separator;
			}else {
				needSeparator=true;
			}
			result += item.toString();
		}
				result += end;
		return result;
	}
		}

