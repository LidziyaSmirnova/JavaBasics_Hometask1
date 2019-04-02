package by.epam.javabasics.part2;

public class Task29 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double cosd;
        double cose;
        double cosf;
        double d;
        double e;
        double f;

        a = 2;
        b = 3;
        c = 4;

        cosd = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / 2.0 * a * c;
        System.out.println("Косинус угла d = " + cosd);

        cose = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / 2.0 * a * b;
        System.out.println("Косинус угла e = " + cose);

        cosf = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / 2.0 * c * b;
        System.out.println("Косинус угла f = " + cosf);
    }
}
