class Item {
    int itemCode;
    String itemName;
    double price;

    void display() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    void totalCost(int quantity) {
        double total = price * quantity;
        System.out.println("Total Cost = " + total);
    }

    public static void main(String[] args) {
        Item i = new Item();

        i.itemCode = 101;
        i.itemName = "Pen";
        i.price = 10;

        i.display();
        i.totalCost(5);
    }
}