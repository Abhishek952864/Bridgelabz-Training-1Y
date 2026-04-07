package Four;

public class Runner {
    public static void main(String[] args) {

        Order o1 = new Order(101, "19-Mar-2026");
        Order o2 = new ShippedOrder(102, "21-Mar-2026", "TRK12345");
        Order o3 = new DeliveredOrder(103, "25-Mar-2026", "TRK67890", "21-Mar-2026");

        o1.displayDetails();
        System.out.println();

        o2.displayDetails();
        System.out.println();

        o3.displayDetails();
    }
}