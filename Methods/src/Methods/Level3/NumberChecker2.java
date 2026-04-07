class NumberCheck2 {

    static int[] digits(int n){
        int c=0,t=n;

        while(t>0){ c++; t/=10; }

        int d[]=new int[c];

        for(int i=c-1;i>=0;i--){
            d[i]=n%10;
            n/=10;
        }
        return d;
    }

    static int sumDigits(int d[]){
        int s=0;
        for(int i:d) s+=i;
        return s;
    }

    static int sumSquare(int d[]){
        int s=0;
        for(int i:d) s+=Math.pow(i,2);
        return s;
    }

    static boolean isHarshad(int n){
        int d[]=digits(n);
        return n%sumDigits(d)==0;
    }

    static void frequency(int d[]){
        int f[][]=new int[10][2];

        for(int i=0;i<10;i++) f[i][0]=i;

        for(int i:d) f[i][1]++;

        for(int i=0;i<10;i++)
            if(f[i][1]>0)
                System.out.println(i+" -> "+f[i][1]);
    }

    public static void main(String args[]){

        int n=21;
        int d[]=digits(n);

        System.out.println("Sum="+sumDigits(d));
        System.out.println("SquareSum="+sumSquare(d));
        System.out.println("Harshad="+isHarshad(n));

        frequency(d);
    }
}