package by.epam.javabasics.part2;

public class Task30 {
    public static void main(String[] args) {
        double r1;
        double r2;
        double r3;
        double r;

        r1 = 200;
        r2 = 300;
        r3 = 400;

        r = 1 / ((1 / r1) + (1 / r2) + (1 / r3));
        System.out.println("Сопротивление соединения " + r);
    }
}
