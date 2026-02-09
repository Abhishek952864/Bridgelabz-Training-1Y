import java.util.Scanner;
class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] per = new double[n];
        char[] g = new char[n];

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt(), c = sc.nextInt(), m = sc.nextInt();
            if (p < 0 || c < 0 || m < 0) { i--; continue; }
            per[i] = (p + c + m) / 3.0;
            g[i] = (per[i] >= 90) ? 'A' : (per[i] >= 75) ? 'B' : (per[i] >= 60) ? 'C' : 'D';
            System.out.println(per[i] + " " + g[i]);
        }
    }
}
