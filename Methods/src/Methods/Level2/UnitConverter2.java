class UnitConvertor2 {

    static double convertFahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }

    static double convertCelsiusToFahrenheit(double c){
        return (c * 9 / 5) + 32;
    }

    static double convertPoundsToKilograms(double p){
        return p * 0.453592;
    }

    static double convertKilogramsToPounds(double k){
        return k * 2.20462;
    }

    static double convertGallonsToLiters(double g){
        return g * 3.78541;
    }

    static double convertLitersToGallons(double l){
        return l * 0.264172;
    }

    public static void main(String[] args) {

        System.out.println(convertFahrenheitToCelsius(100));
        System.out.println(convertCelsiusToFahrenheit(0));
        System.out.println(convertPoundsToKilograms(10));
        System.out.println(convertKilogramsToPounds(5));
        System.out.println(convertGallonsToLiters(2));
        System.out.println(convertLitersToGallons(10));
    }
}