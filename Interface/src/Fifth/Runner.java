package Fifth;

public class Runner {
    public static void main(String[] args) {

        String password = "pass@1234";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}