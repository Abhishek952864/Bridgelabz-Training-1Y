import java.util.Scanner;

class natural {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER NO.= ");
        int num = sc.nextInt();

        if (num > 0) {
            int sum = num * (num + 1) / 2;
            System.out.println("Sum is = " + sum);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
