package by.epam.javabasics.part2;

public class Task33 {
    public static void main(String[] args) {
        char c = '不';
        int u = (int) c;
        System.out.println("Порядковый номер символа: " + u);

        int v = u + 1;
        char ch = (char) v;
        System.out.println("Следующий символ: " + ch);

        int s = u - 1;
        char cha = (char) s;
        System.out.println("Предыдущий символ: " + cha);
    }
}
