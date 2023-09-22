package Exam_19_08_2023_;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodQuantity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int totalEatenFood = 0;
        foodQuantity =foodQuantity*1000;

        while (!command.equals("Adopted")) {
            int foodPortion = Integer.parseInt(command);
            totalEatenFood += foodPortion;
            command = scanner.nextLine();
        }

        int neededFood = totalEatenFood - foodQuantity;

        if (neededFood <= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.%n", Math.abs(neededFood));
        } else {
            System.out.printf("Food is not enough. You need %d grams more.%n", neededFood);
        }
    }
}


