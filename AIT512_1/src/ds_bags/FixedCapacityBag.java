/**
 * @author Jeffrey Wise
 * 
 */

package ds_bags;

public class FixedCapacityBag<T> {
    private T[] bag;
    private int numberOfElements;

    @SuppressWarnings("unchecked")
	public FixedCapacityBag(int capacity) {
        bag = (T[]) new Object[capacity];
        numberOfElements = 0;
    }

    public void add(T item) {
        if (numberOfElements < bag.length) {
            bag[numberOfElements++] = item;
        } else {
            System.out.println("Bag is full");
        }
    }

    public boolean isSingleton() {
        return numberOfElements == 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfElements; i++) {
            sb.append(bag[i]).append(" ");
        }
        return sb.toString();
    }

    public static void alsoTestFixedCapacityBag(String[] items) {
        System.out.println("Create an empty bag of strings with capacity "+ items.length);
        FixedCapacityBag<String> bag = new FixedCapacityBag<>(items.length); //instead of hardcoding to 5, set dynamiclly
        System.out.println ("Bag: "+bag.toString());
        System.out.println("Bag is singleton:"+bag.isSingleton());

        for (String item : items) {
            System.out.println("Add the item: " + item);
            bag.add(item);
            System.out.println("Bag: "+bag.toString());
            System.out.println("Bag is singleton: "+bag.isSingleton());
        }
    }

    public static void main(String[] args) {
        System.out.println("Fixed Capacity Bag - Task 3 - Jeffrey Wise");
        String[] items1 = {"book", "bag", "computer", "phone", "key", "money"};
        alsoTestFixedCapacityBag(items1);
        String[] items2 = {"book", "bag", "computer", "phone", "key", "money"};
        alsoTestFixedCapacityBag(items2);
    }
}
