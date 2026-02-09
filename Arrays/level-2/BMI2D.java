import java.util.Scanner;
class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] p = new double[n][3];
        String[] st = new String[n];

        for (int i = 0; i < n; i++) {
            p[i][0] = sc.nextDouble(); // weight
            p[i][1] = sc.nextDouble(); // height
            p[i][2] = p[i][0] / (p[i][1] * p[i][1]);
            st[i] = (p[i][2] < 18.5) ? "Under" : (p[i][2] < 25) ? "Normal" : "Over";
            System.out.println(p[i][1] + " " + p[i][0] + " " + p[i][2] + " " + st[i]);
        }
    }
}
