import java.util.Scanner;
class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        double[] ht = new double[3];

        for (int i = 0; i < 3; i++) { age[i] = sc.nextInt(); ht[i] = sc.nextDouble(); }

        int y = age[0]; double t = ht[0];
        for (int i = 1; i < 3; i++) { if (age[i] < y) y = age[i]; if (ht[i] > t) t = ht[i]; }
        System.out.println("Youngest=" + y + " Tallest=" + t);
    }
}
