package by.epam.javabasics.part2;

public class Task21 {
    public static void main(String[] args) {
        double r = 222.333;
        int nnn;
        nnn = (int) r;
        System.out.println(nnn);


        r = r * 1000 - nnn * 1000;
        System.out.println(r);

        r = r + nnn / 1000.0;
        System.out.println(r);
    }

}
