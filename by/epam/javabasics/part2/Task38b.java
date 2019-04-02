package by.epam.javabasics.part2;

public class Task38b {
    public static void main(String[] args) {
        int x;
        int y;
        x = -1;
        y = 3;

        if (x < 4 && x > -4 && y < 0 && y > -3) {
            System.out.println("true");
        } else {
            if (x < 2 && x > -2 && y < 4 && y > 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
