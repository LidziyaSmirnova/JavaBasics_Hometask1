package by.epam.javabasics.part2;

public class Task16 {
    public static void main(String[] args) {

        int x = 123456;
        int sum = 0;
        int num;

        while (x > 0) {
            num = x % 10;
            sum = sum + num;
            x = x / 10;
        }
        System.out.println(sum);
    }
}
