class Factors {

    static int[] factors(int n){
        int c=0;
        for(int i=1;i<=n;i++) if(n%i==0) c++;

        int f[]=new int[c],j=0;

        for(int i=1;i<=n;i++)
            if(n%i==0) f[j++]=i;

        return f;
    }

    static int sum(int f[]){
        int s=0;
        for(int i:f) s+=i;
        return s;
    }

    static int product(int f[]){
        int p=1;
        for(int i:f) p*=i;
        return p;
    }

    static double cubeProduct(int f[]){
        double p=1;
        for(int i:f) p*=Math.pow(i,3);
        return p;
    }

    public static void main(String args[]){

        int f[]=factors(6);

        for(int i:f) System.out.print(i+" ");

        System.out.println("\nSum="+sum(f));
        System.out.println("Product="+product(f));
        System.out.println("CubeProduct="+cubeProduct(f));
    }
}