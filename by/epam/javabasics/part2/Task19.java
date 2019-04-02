package by.epam.javabasics.part2;

public class Task19 {
    public static void main(String[] args) {
        double a;
        a = 2; //сторона равностороннего треугольника

        double s;
        double h;
        double r;
        double rad;

        s = (Math.sqrt(3) / 4.0) * Math.pow(a, 2);
        System.out.println("Площадь треугольника = " + s);

        h = (Math.sqrt(3) / 2.0) * 2;
        System.out.println("Высота треугольника = " + h);

        r = a / (2 * Math.sqrt(3));
        System.out.println("Радиус вписанной окружности = " + r);

        rad = a / Math.sqrt(3);
        System.out.println("Радиус описанной окружности = " + rad);
    }
}
