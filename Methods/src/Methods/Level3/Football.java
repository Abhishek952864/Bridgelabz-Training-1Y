class Football {

    static int sum(int a[]){
        int s=0;
        for(int i:a) s+=i;
        return s;
    }

    static double mean(int a[]){
        return (double)sum(a)/a.length;
    }

    static int min(int a[]){
        int m=a[0];
        for(int i:a) if(i<m) m=i;
        return m;
    }

    static int max(int a[]){
        int m=a[0];
        for(int i:a) if(i>m) m=i;
        return m;
    }

    public static void main(String args[]){

        int h[]=new int[11];

        for(int i=0;i<h.length;i++)
            h[i]=(int)(Math.random()*101)+150;

        System.out.println("Mean="+mean(h));
        System.out.println("Shortest="+min(h));
        System.out.println("Tallest="+max(h));
    }
}