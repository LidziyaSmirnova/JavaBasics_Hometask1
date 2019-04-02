package by.epam.javabasics.part2;

public class Task37e {
    public static void main(String[] args) {
        int n;
        int num;
        int sum = 0;
        n = 123;

        while (n > 0) {
            num = n % 10;
            sum = sum + num;
            n = n / 10;
        }

        if (n * n == sum * sum * sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
