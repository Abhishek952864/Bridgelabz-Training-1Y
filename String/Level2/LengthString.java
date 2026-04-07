import java.util.*;

class LengthString {
    static int findLength(String s){
        int i=0;
        try{
            while(true){
                s.charAt(i);
                i++;
            }
        }catch(Exception e){}
        return i;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        System.out.println(findLength(s));
        System.out.println(s.length());
    }
}