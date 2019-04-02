package by.epam.javabasics.part2;

public class Task32 {
    public static void main(String[] args) {
        int m;
        int n;
        int k;
        int p;
        int q;
        int r;
        int y;
        int x;
        int t;

        m = 14;
        n = 47;
        k = 28;
        p = 2;
        q = 47;
        r = 59;

        x = m * 3600 + n * 60 + k;
        y = p * 3600 + q * 60 + r;
        t = x + y;

        m = t / 3600;
        t = t % 3600;
        n = t / 60;
        k = t % 60;
        System.out.println(m + "ч " + n + "м " + k + "с ");
    }
}