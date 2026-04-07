package MultiThreading;

public class Main {
    static void main() {
        A a=new A();
        B b=new B();
        a.start();
        b.start();
        
    }
}
