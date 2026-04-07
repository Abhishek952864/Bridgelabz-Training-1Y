import java.util.Scanner;

public class StringIndexDemo {

    static void handle(String s){
        try{
            System.out.println(s.charAt(s.length()+1));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.next();

        handle(text);
    }
}