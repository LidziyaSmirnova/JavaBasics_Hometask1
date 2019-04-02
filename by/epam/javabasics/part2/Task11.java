package by.epam.javabasics.part2;

public class Task11 {
    public static void main(String[] args) {
        double a;
        double b;
        double temp;
        double p;
        double s;

        a = 10;
        b = 5;

        temp = Math.pow(a, 2) + Math.pow(b, 2);

        p = a + b + Math.sqrt(temp);
        System.out.println("Периметр прямоугольного треугольника = " + p);
        s = (a * b) / 2.0;
        System.out.println("Площадь прямоугольного треугольника = " + s);
    }
}
