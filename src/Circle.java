public class Circle {
    static double radius;

    public Circle(double radius) {
        Circle.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double circumference() {
        return 6.28 * radius;
    }

    public static void main(String[] args) {
        Circle cr = new Circle(5.0);
        double result1 = cr.area();
        System.out.println(" area:" + result1);
        double result2 = cr.circumference();
        System.out.println("circumference: " + result2);
    }
}


