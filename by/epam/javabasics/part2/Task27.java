package by.epam.javabasics.part2;

public class Task27 {
    public static void main(String[] args) {

        int a;
        a = 2;
        int b;
        int c;
        int d;
        int e;

        b = a * a;
        c = b * b;
        d = c * c;
        System.out.println("a в восьмой степени за 3 операции: " + d);
        e = d * b;
        System.out.println("a в десятой степени за 4 операции: " + e);
    }
}
