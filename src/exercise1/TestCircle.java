package exercise1;

public class TestCircle {

    public static void main(String[] strings) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(3, "green");
        System.out.println(circle);
        System.out.println(circle1);
        System.out.println("Area 1: " + circle.getArea());
        System.out.println("Area 2: " + circle1.getArea());
        System.out.println("Circumference 1: " + circle.getCircumference());
        System.out.println("Circumference 2: " + circle1.getCircumference());
        System.out.println("Area 3: " + circle2.getArea());
        System.out.println("Circumference 3: " + circle2.getCircumference());
        System.out.println("Color 3: " + circle2.getColor());
        circle2.setColor("Yellow");
        System.out.println("New Color 3: " + circle2.getColor());
    }
}
