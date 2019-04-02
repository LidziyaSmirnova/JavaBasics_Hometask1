package by.epam.javabasics.part2;

public class Task25 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        double d;

        a = 1;
        b = 12;
        c = 36;

        d = Math.pow(b, 2) - (4 * a * c);
        System.out.println(d);

        if (d > 0) {
            double x1;
            x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double x2;
            x2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("Корень №1 = " + x1);
            System.out.println("Корень №2 = " + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2.0 * a);
            System.out.println("Уравнение имеет единственный корень= " + x);
        } else {
            System.out.println("D < 0, корней нет");
        }
    }
}
