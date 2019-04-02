package by.epam.javabasics.part1;

public class Task6 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double e;
        double exp;

        a = 2;
        b = 8;
        c = 3;

        d = b - c;
        e = Math.pow(b, 2) + 1;
        exp = Math.pow(a, 2) - Math.pow(d, 2) + Math.log(e);
        System.out.println("Значение выражения = " + exp);
    }
}
