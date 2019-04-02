package by.epam.javabasics.part2;

public class Task34 {
    public static void main(String[] args) {
        int a = 251451455;
        int k;
        int m;
        int g;
        int t;

        k = a / 1024;
        System.out.println(a + " байт - это " + k + " килобайт");
        m = k / 1024;
        System.out.println(a + " байт - это " + m + " мегабайт");
        g = m / 1024;
        System.out.println(a + " байт - это " + g + " гигабайт");
        t = g / 1024;
        System.out.println(a + " байт - это " + t + " терабайт");
    }
}
