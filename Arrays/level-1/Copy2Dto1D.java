import java.util.Scanner;
class Copy2Dto1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c];
        int[] b = new int[r*c];
        int k = 0;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                b[k++] = a[i][j];
            }

        for (int i : b) System.out.print(i + " ");
    }
}
