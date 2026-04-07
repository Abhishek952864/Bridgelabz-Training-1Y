import java.util.*;

class AnagramCheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        String b=sc.nextLine();

        int[] freq=new int[256];

        for(int i=0;i<a.length();i++)
            freq[a.charAt(i)]++;

        for(int i=0;i<b.length();i++)
            freq[b.charAt(i)]--;

        boolean flag=true;

        for(int x:freq)
            if(x!=0) flag=false;

        System.out.println(flag);
    }
}