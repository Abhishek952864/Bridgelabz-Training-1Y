import java.util.Scanner;

class spring
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter day");
        int day = sc.nextInt();

        System.out.println("enter month");
        int month = sc.nextInt();

        if ( (day >= 20 && month == 3) ||
             (month == 4) ||
             (month == 5) ||
             (day <= 20 && month == 6) )
        {
            System.out.println("It's a spring season");
        }
        else
        {
            System.out.println("Not a spring season");
        }
    }
}
