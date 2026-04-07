class SpringSeason {

    boolean isSpring(int m, int d) {
        if ((m == 3 && d >= 20) || (m == 4) || (m == 5) || (m == 6 && d <= 20))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        SpringSeason obj = new SpringSeason();

        if (obj.isSpring(month, day))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}