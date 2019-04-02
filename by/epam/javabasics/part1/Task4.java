package by.epam.javabasics.part1;

public class Task4 {
    public static void main(String[] args) {

        double a; //катет а
        double b; //катет b
        double c; // квадрат гипотенузы
        double d; // гипотенуза
        double s; // площадь

        a = 3;
        b = 4;

        c = Math.pow(a, 2) + Math.pow(b, 2);
        d = Math.sqrt(c);
        System.out.println("Гипотенуза прямоугольного треугольника: " + d);

        s = a * b / 2;
        System.out.println("Площадь прямоугольного треугольника: " + s);
    }
}
