public class Circle {

    double radius = 2.5;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of circle: %.4f%n", area);
    }

    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference of circle: %.4f%n", circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculateArea();
        c.calculateCircumference();
    }
}
