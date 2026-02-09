import java.util.Scanner;
class DigitsMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), idx = 0;
        int[] d = new int[10];

        while (n != 0 && idx < 10) { d[idx++] = n % 10; n /= 10; }

        int max = 0, smax = 0;
        for (int i = 0; i < idx; i++) {
            if (d[i] > max) { smax = max; max = d[i]; }
            else if (d[i] > smax && d[i] != max) smax = d[i];
        }
        System.out.println(max + " " + smax);
    }
}
