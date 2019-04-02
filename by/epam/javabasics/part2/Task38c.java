package by.epam.javabasics.part2;

public class Task38c {
    public static void main(String[] args) {
        int x;
        int y;

        x = 3;
        y = -4;

        if (x > 0 && y > 0 && Math.sqrt(x * x + y * y) <= 4) {
            System.out.println("true");
        } else {
            if (x > 0 && y < 0 && Math.sqrt(x * x + y * y) <= 5) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
