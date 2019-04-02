package by.epam.javabasics.part2;

public class Task37c {
    public static void main(String[] args) {
        int n;
        n = 124;

        int sum;

        sum = n / 100 + n / 10 % 10 + n % 10;
        if (sum % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
