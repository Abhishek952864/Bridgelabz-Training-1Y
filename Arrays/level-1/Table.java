import java.util.Scanner;
class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] t = new int[10];

        for (int i = 1; i <= 10; i++) {
            t[i-1] = num * i;
            System.out.println(num + " * " + i + " = " + t[i-1]);
        }
    }
}
