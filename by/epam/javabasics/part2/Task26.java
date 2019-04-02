package by.epam.javabasics.part2;

public class Task26 {
    public static void main(String[] args) {
        double a;
        double b;
        double y;
        double s;

        a = 2;
        b = 4;
        y = 90;

        s = a * b / 2.0 * Math.sin(y * Math.PI / 180.0);
        System.out.println("Площадь треугольника: " + s);
    }
}
