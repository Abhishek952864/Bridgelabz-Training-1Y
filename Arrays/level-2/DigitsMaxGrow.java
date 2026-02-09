import java.util.Scanner;
class DigitsMaxGrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), size = 10, idx = 0;
        int[] d = new int[size];

        while (n != 0) {
            if (idx == size) {
                size += 10;
                int[] t = new int[size];
                for (int i = 0; i < idx; i++) t[i] = d[i];
                d = t;
            }
            d[idx++] = n % 10; n /= 10;
        }

        int max = 0, smax = 0;
        for (int i = 0; i < idx; i++) {
            if (d[i] > max) { smax = max; max = d[i]; }
            else if (d[i] > smax && d[i] != max) smax = d[i];
        }
        System.out.println(max + " " + smax);
    }
}
