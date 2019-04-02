package by.epam.javabasics.part2;

public class Task24 {
    public static void main(String[] args) {
        double a;
        double b;
        double ang;
        double s;

        a = 4;
        b = 3;
        ang = 60;

        if (a > b) {
            double c;
            c = (a - b) / (2.0 * Math.cos(ang * Math.PI / 180.0));
            s = c * Math.sin(ang * Math.PI / 180.0) * (a - (c * Math.cos(ang * Math.PI / 180.0)));
            System.out.print("Площадь равнобедренной трапеции равна " + s);
        } else {
            System.out.print("Основание а должно быть больше основания в. Введите правильные значения");
        }
    }
}
