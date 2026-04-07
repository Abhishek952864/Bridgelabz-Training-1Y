class RandomNumbers {

    static int[] generate4DigitRandomArray(int size){
        int a[] = new int[size];
        for(int i=0;i<size;i++)
            a[i] = (int)(Math.random()*9000) + 1000;
        return a;
    }

    static double[] findAverageMinMax(int n[]){
        int min=n[0], max=n[0], sum=0;

        for(int i:n){
            sum+=i;
            min=Math.min(min,i);
            max=Math.max(max,i);
        }

        double avg=(double)sum/n.length;
        return new double[]{avg,min,max};
    }

    public static void main(String[] args){

        int nums[]=generate4DigitRandomArray(5);

        for(int i:nums) System.out.print(i+" ");

        double r[]=findAverageMinMax(nums);

        System.out.println("\nAverage="+r[0]);
        System.out.println("Min="+(int)r[1]);
        System.out.println("Max="+(int)r[2]);
    }
}