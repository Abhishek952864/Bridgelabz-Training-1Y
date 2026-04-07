class NumberChecker {

    static int countDigits(int n){
        int c=0;
        while(n>0){ c++; n/=10; }
        return c;
    }

    static int[] digits(int n){
        int c=countDigits(n);
        int d[]=new int[c];

        for(int i=c-1;i>=0;i--){
            d[i]=n%10;
            n/=10;
        }
        return d;
    }

    static boolean isDuck(int d[]){
        for(int i:d) if(i==0) return true;
        return false;
    }

    static boolean isArmstrong(int n){
        int sum=0,t=n;
        int p=countDigits(n);

        while(n>0){
            int r=n%10;
            sum+=Math.pow(r,p);
            n/=10;
        }
        return sum==t;
    }

    public static void main(String args[]){

        int n=153;
        int d[]=digits(n);

        System.out.println("Digits="+countDigits(n));
        System.out.println("Duck="+isDuck(d));
        System.out.println("Armstrong="+isArmstrong(n));
    }
}