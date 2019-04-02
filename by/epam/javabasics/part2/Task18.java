package by.epam.javabasics.part2;

public class Task18 {
    public static void main(String[] args) {

        double a;
        a = 2; //длина ребра куба

        double ss;
        double sf;
        double v;

        ss = Math.pow(a, 2);
        System.out.println("Площадь грани куба = " + ss);

        sf = ss * 6;
        System.out.println("Площадь полной поверхности куба = " + sf);

        v = 6 * Math.pow(a, 3);
        System.out.println("Объем куба = " + v);
    }
}
