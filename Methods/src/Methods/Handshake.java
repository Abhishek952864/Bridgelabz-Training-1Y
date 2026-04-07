//Create a program to find the maximum number of handshakes among students.
//        Hint =>
//        a. Get integer input for the numberOfStudents variable.
//        b. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of
//        possible handshakes.
//        c. Write a method to use the combination formulae to calculate the number of handshakes
//        d. Display the number of possible handshakes.
import java.util.Scanner;

class Handshake {

    static int count(int n) {
        return (n * (n - 1)) / 2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.println("Maximum handshakes = " + count(n));
    }
}