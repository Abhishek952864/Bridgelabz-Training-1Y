class UnitConvertor {

    public double convertYardsToFeet(double yards){
        return yards * 3;
    }

    public double convertFeetToYards(double feet){
        return feet * 0.333333;
    }

    public double convertMetersToInches(double meters){
        return meters * 39.3701;
    }

    public double convertInchesToMeters(double inches){
        return inches * 0.0254;
    }

    public double convertInchesToCm(double inches){
        return inches * 2.54;
    }

    public static void main(String[] args) {

        UnitConvertor u = new UnitConvertor();

        System.out.println(u.convertYardsToFeet(2));
        System.out.println(u.convertFeetToYards(6));
        System.out.println(u.convertMetersToInches(1));
        System.out.println(u.convertInchesToMeters(10));
        System.out.println(u.convertInchesToCm(5));
    }
}