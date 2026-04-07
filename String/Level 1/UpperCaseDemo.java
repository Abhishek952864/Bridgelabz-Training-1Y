import java.util.Scanner;

public class UpperCaseDemo {

    static String myUpper(String s){
        String res="";

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c>='a' && c<='z')
                c=(char)(c-32);

            res+=c;
        }
        return res;
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

        String text=sc.nextLine();

        String s1=myUpper(text);
        String s2=text.toUpperCase();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(compare(s1,s2));
    }
}
