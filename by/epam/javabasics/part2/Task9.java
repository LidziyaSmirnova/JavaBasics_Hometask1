package by.epam.javabasics.part2;

public class Task9 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double res;

        a = 33;
        b = -0.17;
        c = 4;
        d = 1.2;

        res = ((a/c)*(b/d)) - (((a*b)-c)/(c*d));
        System.out.println(res);
    }
}
