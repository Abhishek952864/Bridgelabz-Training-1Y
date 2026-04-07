import java.util.*;

class SplitWords{
    static String[] split(String s){
        ArrayList<String> list=new ArrayList<>();
        String word="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                list.add(word);
                word="";
            }else{
                word+=s.charAt(i);
            }
        }
        list.add(word);

        return list.toArray(new String[0]);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String[] a=split(s);
        String[] b=s.split(" ");

        System.out.println(Arrays.equals(a,b));
    }
}