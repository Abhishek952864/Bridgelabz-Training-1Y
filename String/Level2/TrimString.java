import java.util.*;

class TrimString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int start=0,end=s.length()-1;

        while(s.charAt(start)==' ') start++;
        while(s.charAt(end)==' ') end--;

        String t=s.substring(start,end+1);

        System.out.println(t);
        System.out.println(s.trim());
    }
}