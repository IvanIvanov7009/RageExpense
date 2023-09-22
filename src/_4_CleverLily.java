

import java.util.Scanner;

public class _4_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double totalMoney;
        if (age % 2 == 0) {
            int ageHalf = age / 2;
            // birthdays
            totalMoney = (((double) ageHalf / 2) * (2 * 10 + (ageHalf-1) * 10)) - ageHalf;
            // toys
            totalMoney += (double) age / 2 * toyPrice;
        } else {
            int ageHalf = (age-1) / 2;
            // birthdays
            totalMoney = (((double) ageHalf / 2) * (2 * 10 + (ageHalf-1) * 10)) - ageHalf;
            // toys
            totalMoney += (double) (age-1) / 2 * toyPrice + toyPrice;
        }

        if (totalMoney >= washerPrice) {
            System.out.printf("Yes! %.2f\n", totalMoney - washerPrice);
        } else {
            System.out.printf("No! %.2f\n", washerPrice - totalMoney);
        }

    }
}
