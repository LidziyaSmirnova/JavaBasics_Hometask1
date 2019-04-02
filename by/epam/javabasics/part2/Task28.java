package by.epam.javabasics.part2;

public class Task28 {
    public static void main(String[] args) {
        double rad;
        double min;
        double grad;
        double sec;

        rad = 0.17;
        min = 57;

        grad = (rad * 180) / Math.PI;
        System.out.println(rad + " радиан - это " + grad + " градусов");

        sec = min * 60;
        System.out.println(min + " минут - это " + sec + "секунд");
    }
}
