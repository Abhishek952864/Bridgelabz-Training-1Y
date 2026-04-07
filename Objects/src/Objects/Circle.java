class Circle {
    double radius;

    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area = " + a);
    }

    void circumference() {
        double c = 2 * 3.14 * radius;
        System.out.println("Circumference = " + c);
    }

    public static void main(String[] args) {
        Circle c = new Circle();

        c.radius = 5;

        c.area();
        c.circumference();
    }
}