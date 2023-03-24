package ru.ibs.program7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final double x = 1.5;
        final double y = 5;
        final double z = -327.34;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива (размер массива должен быть > 0):");
        int length = input.nextInt();
        double[] array = new double[length];

        System.out.println("Введите значения массива");
        for (int i=0; i<array.length; i++) {
            System.out.println("array["+i+"]=");
            array[i] = input.nextDouble();
            if (array[i] == x || array[i] == y || array[i] == z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}

