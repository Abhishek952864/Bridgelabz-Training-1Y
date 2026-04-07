//An athlete runs in a triangular park with sides provided as input by the user in meters. If the
//        athlete wants to complete a 5 km run, then how many rounds must the athlete complete
//        Hint =>
//        a. Take user input for 3 sides of a triangle
//        b. The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
//        c. Write a Method to compute the number of rounds user needs to do to complete 5km run
import java.util.Scanner;

class RunRounds {

    static double rounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;   // 5 km = 5000 m
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Rounds needed = " + rounds(a, b, c));
    }
}