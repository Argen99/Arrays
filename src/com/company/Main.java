package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Введите первое число");

        num1 = num.nextInt();
        System.out.println("Введите второе число");
        num2 = num.nextInt();
        num3 = num1 + num2;
        System.out.println(num3);

	// write your code here
    }
}
