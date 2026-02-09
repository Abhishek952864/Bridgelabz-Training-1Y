import java.util.Scanner;
class Grades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][3];

        for (int i = 0; i < n; i++) {
            m[i][0] = sc.nextInt(); m[i][1] = sc.nextInt(); m[i][2] = sc.nextInt();
            double per = (m[i][0] + m[i][1] + m[i][2]) / 3.0;
            char g = (per >= 90) ? 'A' : (per >= 75) ? 'B' : (per >= 60) ? 'C' : 'D';
            System.out.println(per + " " + g);
        }
    }
}
