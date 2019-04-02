package by.epam.javabasics.part2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        double a;
        double c;

        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите a: > ");
        a = scanner.nextDouble();
        c = 3 + a;
        System.out.println("Значение функции: " + c);
    }
}
