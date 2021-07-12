package exercise1_1;

public class TestDate {

    public static void main(String[] strings) {
        var date = new Date(12,12,2021);
        System.out.println("Area: " + date);
        date.setMonth(1);
        System.out.println("Area: " + date);
    }
}
