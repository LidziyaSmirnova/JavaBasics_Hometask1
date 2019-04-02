package by.epam.javabasics.part2;

public class Task17 {
    public static void main(String[] args) {

        double a;
        double b;
        double x;
        double y;

        a=2;
        b=-3;

        x = (Math.pow(a, 3) + Math.pow(b, 3)) / 2.0;
        System.out.println("Среднее арифметическое кубов чисел = " + x);

        y = Math.sqrt(Math.abs(a)*Math.abs(b));
        System.out.println("Среднее геометрическое модулей чисел = " + y);
    }
}
