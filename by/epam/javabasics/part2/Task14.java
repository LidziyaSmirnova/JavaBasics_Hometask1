package by.epam.javabasics.part2;

public class Task14 {
    public static void main(String[] args) {
        double r;
        double l;
        double s;

        r = 10;

        l = 2 * Math.PI * r;
        System.out.println("Длина окружности: " + l);

        s = Math.PI * Math.pow(r, 2);
        System.out.println("Площадь круга: " + s);

    }
}
