package Third;

public class Runner {
    public static void main(String[] args) {

        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Wallet();

        p1.pay(485);
        p2.pay(1000);
        p3.pay(600);
    }
}