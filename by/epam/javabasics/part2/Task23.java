package by.epam.javabasics.part2;

public class Task23 {
    public static void main(String[] args) {
        double ir;
        double er;
        double s;

        ir = 2;
        er = 4;

        if (er > ir) {
            s = Math.PI * (Math.pow(er, 2) - Math.pow(ir, 2));
            System.out.println(s);
        } else {
            System.out.println("Внешний радиус не может быть меньше внутреннего радиуса. Введите верное значение");
        }

    }
}
