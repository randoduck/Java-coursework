class Counter {
    static int count = 0; // Static data member to count objects

    // Constructor
    Counter() {
        count++;
        System.out.println("Counter object created. Total count: " + count);
    }

    // Static method to display count
    static void showCount() {
        System.out.println("Total Counter objects created: " + count);
    }

    public static void main(String[] args) {
        // Creating objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Displaying count using static method
        Counter.showCount();
    }
}
