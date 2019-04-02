package by.epam.javabasics.part2;

public class Task35 {
    public static void main(String[] args) {
        int m;
        int n;
        int a;
        int b;

        m = 67899;
        n = 17;

        if (m > 0 & n > 0) {
            double mn;
            mn = m / (double) n;
            System.out.println(mn);
            a = (int) ((mn * 10) % 10);
            System.out.println("Старшая цифра дробной части: " + a);
            b = (int) (mn % 10);
            System.out.println("Младшая цифра целой части: " + b);
        } else {
            System.out.println("m,n - не натуральные числа. Введите корректное значение");
        }
    }
}
