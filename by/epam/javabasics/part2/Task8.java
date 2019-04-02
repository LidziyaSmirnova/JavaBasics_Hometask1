package by.epam.javabasics.part2;

public class Task8 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double res;

        a = 1.2;
        b = -0.17;
        c = 4;

        res = ((b+Math.sqrt(Math.pow(b, 2)+(4*a*c))) / (2.0*a)) - (Math.pow(a, 3)*c) + Math.pow(b, -2);
        System.out.println(res);
    }
}
