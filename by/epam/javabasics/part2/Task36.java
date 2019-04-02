package by.epam.javabasics.part2;

public class Task36 {
    public static void main(String[] args) {
        int a;
        int n;
        int even;
        int odd;

        a = 1234;
        even = 1;
        odd = 1;

        while (a > 0) {
            n = a % 10;
            if (n % 2 == 0) {
                even = even * n;
            } else {
                odd = odd * n;
            }
            a = a / 10;
        }
        System.out.println("Произведение четных цифр числа: " +even);
        System.out.println("Произведение нечетных цифр числа: " + odd);
        System.out.println(even / odd);
    }
}
