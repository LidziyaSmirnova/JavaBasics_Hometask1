package by.epam.javabasics.part2;

public class Task22 {
    public static void main(String[] args) {
        int t;
        t = 22896;

        int hh;
        int mm;
        int ss;

        hh = t / 3600;
        mm = (t - hh * 3600) / 60;
        ss = t - hh * 3600 - mm * 60;

        System.out.println(hh + " ч " + mm + " мин " + ss + " с");
    }
}
