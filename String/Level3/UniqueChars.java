import java.util.*;

class UniqueChars{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        char[] res=new char[s.length()];
        int k=0;

        for(int i=0;i<s.length();i++){
            boolean unique=true;

            for(int j=0;j<i;j++)
                if(s.charAt(i)==s.charAt(j))
                    unique=false;

            if(unique) res[k++]=s.charAt(i);
        }

        for(int i=0;i<k;i++)
            System.out.print(res[i]+" ");
    }
}