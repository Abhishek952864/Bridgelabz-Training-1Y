import java.util.*;

class VowelCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int v=0,c=0;

        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));

            if("aeiou".indexOf(ch)!=-1) v++;
            else if(ch>='a' && ch<='z') c++;
        }

        System.out.println("Vowels="+v);
        System.out.println("Consonants="+c);
    }
}