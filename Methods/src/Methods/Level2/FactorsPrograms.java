import java.util.Scanner;

class Factors {

    static int[] findFactors(int n){
        int c=0;
        for(int i=1;i<=n;i++) if(n%i==0) c++;

        int f[]=new int[c];
        int j=0;
        for(int i=1;i<=n;i++) if(n%i==0) f[j++]=i;

        return f;
    }

    static int sum(int f[]){
        int s=0; for(int i:f) s+=i; return s;
    }

    static int product(int f[]){
        int p=1; for(int i:f) p*=i; return p;
    }

    static double sumSq(int f[]){
        double s=0; for(int i:f) s+=Math.pow(i,2); return s;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int f[]=findFactors(n);

        for(int i:f) System.out.print(i+" ");
        System.out.println("\nSum="+sum(f));
        System.out.println("Product="+product(f));
        System.out.println("SumSq="+sumSq(f));
    }
}