import java.util.*;

class Line {

    static double dist(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    public static void main(String[] a){

        Scanner sc=new Scanner(System.in);

        int x1=sc.nextInt(),y1=sc.nextInt();
        int x2=sc.nextInt(),y2=sc.nextInt();

        double m=(double)(y2-y1)/(x2-x1);
        double b=y1-m*x1;

        System.out.println("Distance="+dist(x1,y1,x2,y2));
        System.out.println("Equation: y="+m+"x+"+b);
    }
}