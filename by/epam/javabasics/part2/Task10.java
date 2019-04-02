package by.epam.javabasics.part2;

public class Task10 {
    public static void main(String[] args) {
        double x;
        double y;
        double res;
        double temp;

        x = 90;
        y = 0;

        temp = (x * Math.PI / 180.0) * (y * Math.PI / 180.0);

        res = ((Math.sin(x * Math.PI / 180.0) + Math.cos(y * Math.PI / 180.0)) / (Math.cos(x * Math.PI / 180.0) + Math.sin(y * Math.PI / 180.0))) * Math.tan(temp);
        System.out.println(res);
    }
}
