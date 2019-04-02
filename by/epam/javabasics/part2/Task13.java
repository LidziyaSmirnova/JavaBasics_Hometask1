package by.epam.javabasics.part2;

public class Task13 {
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;
        double ab;
        double ac;
        double bc;
        double s;
        double p;
        double hp;

        x1 = -2;
        y1 = 1;
        x2 = 2.5;
        y2 = -3;
        x3 = 10;
        y3 = 10;

        ab = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Сторона AB = " + ab);
        ac = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        System.out.println("Сторона AC = " + ac);
        bc = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        System.out.println("Сторона AC = " + bc);

        p = ab + ac + bc;
        System.out.println("Периметр треугольника = " + p);

        hp = (ab + ac + bc) / 2.0;
        s = Math.sqrt(hp * (hp - ab) * (hp - ac) * (hp - bc));
        System.out.println("Площадь треугольника = " + s);
    }
}
