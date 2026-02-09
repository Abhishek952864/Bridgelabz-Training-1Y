import java.util.Scanner;
class BonusCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sal = new double[10], yrs = new double[10], bonus = new double[10], newSal = new double[10];
        double totBonus = 0, totOld = 0, totNew = 0;

        for (int i = 0; i < 10; i++) {
            sal[i] = sc.nextDouble();
            yrs[i] = sc.nextDouble();
            if (sal[i] <= 0 || yrs[i] < 0) { i--; continue; }
        }

        for (int i = 0; i < 10; i++) {
            bonus[i] = (yrs[i] > 5) ? sal[i] * 0.05 : sal[i] * 0.02;
            newSal[i] = sal[i] + bonus[i];
            totBonus += bonus[i];
            totOld += sal[i];
            totNew += newSal[i];
        }
        System.out.println(totBonus + " " + totOld + " " + totNew);
    }
}
