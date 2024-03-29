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

    /*public boolean isSingleton() {
        return numberOfElements == 1;
    }*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfElements; i++) {
            sb.append(bag[i]).append(" ");
        }
        return sb.toString();
    }

    public void alsoTestFixedCapacityBag(String[] items) {
        System.out.println("Create an empty bag of strings with capacity "+ items.length);
        //this.bag = new TestBags<>(items.length);
        DynamicCapacityBag<String> bag = new DynamicCapacityBag<>(items.length); //instead of hardcoding to 5, set dynamiclly

        System.out.println ("Bag: "+bag.toString());
        System.out.println("Bag is singleton:"+bag.isSingleton());
        System.out.println("Bag is isEmpty:"+bag.isEmpty());
        for (String item : items) {
            System.out.println("Add the item: " + item);
            bag.add( item);
            System.out.println("Bag: "+bag.toString());
            System.out.println("Bag is singleton: "+bag.isSingleton());
            System.out.println("Bag is isEmpty: "+bag.isEmpty());
        }
    }

    public static void main(String[] args) {
        System.out.println("Fixed Capacity Bag - Task 1 - Jeffrey Wise");
        // your test goes here
        
        String[] items = {"book", "bag", "computer", "phone", "key"};
        TestBags<String> testBags =new TestBags<>(items.length);
        testBags.alsoTestFixedCapacityBag(items);
    }
}




	
