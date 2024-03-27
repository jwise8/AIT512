/**
 * @author Jeffrey Wise
 * 
 */

package ds_bags;

//adding a temporary comment here to test GitHub
public class TestBags<T> {
    private T[] bag;
    private int numberOfElements;

    @SuppressWarnings("unchecked")
	public TestBags(int capacity) {
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
        TestBags<String> bag = new TestBags<>(items.length);
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
        System.out.println("Fixed Capacity Bag - Task 1 - Jeffrey Wise");
        // your test goes here
        
        String[] items = {"book", "bag", "computer", "phone", "key"};
        alsoTestFixedCapacityBag(items);
    }
}




	
