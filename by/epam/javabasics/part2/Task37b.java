package by.epam.javabasics.part2;

public class Task37b {
    public static void main(String[] args) {
        int n;
        n = 9499;

        int sum1;
        int sum2;

        sum1 = n / 1000 + n / 100 % 10;
        sum2 = n % 100 / 10 + n % 10;
        if (sum1 == sum2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
