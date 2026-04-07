import java.util.Scanner;

public class SubstringDemo {

    static String mySubstring(String s,int start,int end){
        String sub="";
        for(int i=start;i<end;i++){
            sub+=s.charAt(i);
        }
        return sub;
    }

    static boolean compare(String a,String b){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String text=sc.next();
        int start=sc.nextInt();
        int end=sc.nextInt();

        String s1=mySubstring(text,start,end);
        String s2=text.substring(start,end);

        System.out.println("My Substring: "+s1);
        System.out.println("Built-in: "+s2);
        System.out.println("Same: "+compare(s1,s2));
    }
}