package by.epam.javabasics.part2;

public class Task12 {
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;
        double s;

        x1 = -2;
        y1 = 1;
        x2 = 2.5;
        y2 = -3;

        s = Math.sqrt(Math.pow(Math.abs((x2 - x1)), 2) + Math.pow(Math.abs((y2 - y1)), 2));
        System.out.println("Расстояние между точками = " + s);
    }
}
