import java.util.Scanner;

class LeapYear {

    static boolean isLeap(int year){
        if(year >= 1582 && (year%4==0 && year%100!=0 || year%400==0))
            return true;
        else
            return false;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        if(isLeap(year))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}