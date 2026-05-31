public class Cart {

    private Item[] itms;
    private int count;

    public Cart(int max) {
        itms = new Item[max];
        count = 0;
    }

    public class Item {
        private String name;
        private int qty;
        private double price;

        public Item(String name, int qty, double price) {
            this.name = name;
            this.qty = qty;
            this.price = price;
        }

        public double getTotal() {
            return qty * price;
        }

        public String getInfo() {
            return name + ", " + qty + " @ " + price + " each, Total: " + getTotal();
        }
    }

    public void add(String name, int qty, double price) {
        if (count < itms.length) {
            itms[count++] = new Item(name, qty, price);
        } else {
            System.out.println("Cart full.");
        }
    }

    public void show() {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.println(itms[i].getInfo());
            }
            System.out.println("Total: " + calcTotal());
        } else {
            System.out.println("Empty cart.");
        }
    }

    public double calcTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += itms[i].getTotal();
        }
        return total;
    }

    public static void main(String[] args) {
        Cart cart = new Cart(4);
        cart.add("Tablet", 1, 50000);
        cart.add("Jwellery", 2, 5000);
        cart.add("Notebook", 5, 500);
        cart.show();
    }
}
