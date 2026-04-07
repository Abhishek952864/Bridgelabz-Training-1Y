import java.util.Scanner;

class Friends {

    static int youngest(int age[]) {
        int min = age[0];
        for(int i=1;i<age.length;i++)
            if(age[i] < min) min = age[i];
        return min;
    }

    static int tallest(int h[]) {
        int max = h[0];
        for(int i=1;i<h.length;i++)
            if(h[i] > max) max = h[i];
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age[] = new int[3];
        int height[] = new int[3];
        String name[] = {"Amar","Akbar","Anthony"};

        for(int i=0;i<3;i++){
            age[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }

        int y = youngest(age);
        int t = tallest(height);

        for(int i=0;i<3;i++)
            if(age[i]==y) System.out.println("Youngest: "+name[i]);

        for(int i=0;i<3;i++)
            if(height[i]==t) System.out.println("Tallest: "+name[i]);
    }
}