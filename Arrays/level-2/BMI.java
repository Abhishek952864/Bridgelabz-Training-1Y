import java.util.Scanner;
class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] w = new double[n], h = new double[n], bmi = new double[n];
        String[] st = new String[n];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextDouble(); h[i] = sc.nextDouble();
            bmi[i] = w[i] / (h[i] * h[i]);
            st[i] = (bmi[i] < 18.5) ? "Under" : (bmi[i] < 25) ? "Normal" : "Over";
        }
        for (int i = 0; i < n; i++)
            System.out.println(h[i] + " " + w[i] + " " + bmi[i] + " " + st[i]);
    }
}
