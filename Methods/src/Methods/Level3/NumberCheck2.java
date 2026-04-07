class NumberCheck2 {

    static int sumDiv(int n){
        int s=0;
        for(int i=1;i<n;i++)
            if(n%i==0) s+=i;
        return s;
    }

    static boolean isPerfect(int n){
        return sumDiv(n)==n;
    }

    static boolean isAbundant(int n){
        return sumDiv(n)>n;
    }

    static boolean isDeficient(int n){
        return sumDiv(n)<n;
    }

    static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }

    static boolean isStrong(int n){
        int sum=0,t=n;
        while(n>0){
            sum+=fact(n%10);
            n/=10;
        }
        return sum==t;
    }

    public static void main(String args[]){
        int n=145;

        System.out.println("Perfect="+isPerfect(n));
        System.out.println("Abundant="+isAbundant(n));
        System.out.println("Deficient="+isDeficient(n));
        System.out.println("Strong="+isStrong(n));
    }
}