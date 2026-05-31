class Counter {
    // Static data member to count the number of objects created
    static int count = 0;  // Make 'count' static so it's shared across all objects

    // Constructor to increment the count whenever a new object is created
    public Counter() {
        count++;  // Increment count each time an object is created
    }

    // Static member function to display the current count of objects created
    public static void showCount() {
        System.out.println("Number of Counter objects created: " + count);
    }
}

public class CounterTest {
    public static void main(String[] args) {
        // Calling the static method to show the initial count (0 objects initially)
        Counter.showCount();

        // Creating Counter objects
        Counter obj1 = new Counter();  // First object is created
        Counter.showCount();  // Displays count after creating the first object

        Counter obj2 = new Counter();  // Second object is created
        Counter.showCount();  // Displays count after creating the second object

        Counter obj3 = new Counter();  // Third object is created
        Counter.showCount();  // Displays count after creating the third object
    }
}
