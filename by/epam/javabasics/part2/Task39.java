package by.epam.javabasics.part2;

public class Task39 {
    public static void main(String[] args) {
        int x;
        int y;
        int res;

        x = 2;
        y = x*((x *(x * (2 * x - 3))) + (4 * x - 5)) + 6;
        res=x*(x * (x * (2 * x - 3) + 4) - 5) + 6;
        System.out.println(y);
        System.out.println(res);
    }
}
