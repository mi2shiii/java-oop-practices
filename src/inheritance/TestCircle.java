package inheritance;

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

        Cylinder cylinder = new Cylinder();
        System.out.println("default volume is: " + cylinder.getVolume());
        Cylinder cylinder1 = new Cylinder(2.0);
        System.out.println("volume with height 2.0 is: " + cylinder1.getVolume());
        Cylinder cylinder2 = new Cylinder(2.0, 3.0);
        System.out.println("volume with radius 2.0 and height 3.0 is: " + cylinder2.getVolume());
    }
}
