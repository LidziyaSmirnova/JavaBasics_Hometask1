package by.epam.javabasics.part2;

public class Task31 {
    public static void main(String[] args) {
        double v;
        double v1;
        double t1;
        double t2;
        double s;

        v = 35;
        v1 = 17;
        t1 = 5.25;
        t2 = 2;

        s = (v * t1) + (v - v1) * t2;
        System.out.println("Путь, пройденный лодкой: " + s);
    }
}
