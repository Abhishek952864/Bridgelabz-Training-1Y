import java.util.Scanner;
class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[10];
        double sum = 0;
        int i = 0;

        while (true) {
            double n = sc.nextDouble();
            if (n <= 0 || i == 10) break;
            a[i++] = n;
        }

        for (int j = 0; j < i; j++) sum += a[j];
        System.out.println("Sum = " + sum);
    }
}
