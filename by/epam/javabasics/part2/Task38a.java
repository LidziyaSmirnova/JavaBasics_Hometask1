package by.epam.javabasics.part2;

public class Task38a {
    public static void main(String[] args) {
        int x;
        int y;
        x = -2;
        y = 1;

        if (x > 0 && y > 0 && x + y <= 4) {
            System.out.println("true");
        } else {
            if (x < 0 && y > 0 && x + y <= 4) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}

