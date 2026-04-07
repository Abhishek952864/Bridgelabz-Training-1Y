class Zara {

    public static void main(String[] a){

        double oldSum=0,newSum=0,bonusSum=0;

        for(int i=0;i<10;i++){

            double salary=(int)(Math.random()*90000)+10000;
            int years=(int)(Math.random()*10)+1;

            double bonus=(years>5)?salary*0.05:salary*0.02;
            double newSal=salary+bonus;

            oldSum+=salary;
            newSum+=newSal;
            bonusSum+=bonus;
        }

        System.out.println("Old Salary="+oldSum);
        System.out.println("New Salary="+newSum);
        System.out.println("Total Bonus="+bonusSum);
    }
}