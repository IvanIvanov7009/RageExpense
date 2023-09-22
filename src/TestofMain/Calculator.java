package TestofMain;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете първо число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Въведете оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Въведете второ число: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Невалиден оператор!");
        }

        System.out.println("Резултат: " + result);

        scanner.close();
    }
}

