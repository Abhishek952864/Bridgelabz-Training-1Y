import java.util.*;

class ShortLong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String[] w=s.split(" ");

        String min=w[0],max=w[0];

        for(String x:w){
            if(x.length()<min.length()) min=x;
            if(x.length()>max.length()) max=x;
        }

        System.out.println("Shortest: "+min);
        System.out.println("Longest: "+max);
    }
}