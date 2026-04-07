package Methods;
//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
//        Hint =>
//a. Simple Interest = Principal * Rate * Time / 100
//b. Take user input for principal, rate, time
//c. Write a method to calculate the simple interest given principle, rate and time as
//        parameters
//d. Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
import java.util.Scanner;

class SimpleInterest {

    double si(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        SimpleInterest obj = new SimpleInterest();
        double result = obj.si(p, r, t);

        System.out.println("Simple Interest = " + result);
    }
}