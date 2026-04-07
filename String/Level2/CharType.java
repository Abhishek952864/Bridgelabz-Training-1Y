import java.util.*;

class CharType{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));

            if("aeiou".indexOf(ch)!=-1)
                System.out.println(ch+" Vowel");
            else if(ch>='a' && ch<='z')
                System.out.println(ch+" Consonant");
            else
                System.out.println(ch+" Not Letter");
        }
    }
}