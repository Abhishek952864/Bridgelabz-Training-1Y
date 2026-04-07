import java.util.*;

class WordLength{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String[] w=s.split(" ");
        String[][] arr=new String[w.length][2];

        for(int i=0;i<w.length;i++){
            arr[i][0]=w[i];
            arr[i][1]=String.valueOf(w[i].length());
        }

        for(String[] x:arr)
            System.out.println(x[0]+" "+x[1]);
    }
}