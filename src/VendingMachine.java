import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Въведете ресто (в левове): ");
            double leva = Double.parseDouble(scanner.nextLine());
            if (leva < 0) {
                System.out.println("Моля, въведете положително число.");
                return;
            }

            double resto = leva * 100; // Преобразуваме левовете в стотинки

            int num2lv = 0, num1lv = 0, num50st = 0, num20st = 0, num10st = 0, num5st = 0, num2st = 0, num1st = 0;

            while (resto >= 200) {
                resto -= 200;
                num2lv++;
            }
            while (resto >= 100) {
                resto -= 100;
                num1lv++;
            }
            while (resto >= 50) {
                resto -= 50;
                num50st++;
            }
            while (resto >= 20) {
                resto -= 20;
                num20st++;
            }
            while (resto >= 10) {
                resto -= 10;
                num10st++;
            }
            while (resto >= 5) {
                resto -= 5;
                num5st++;
            }
            while (resto >= 2) {
                resto -= 2;
                num2st++;
            }
            while (resto >= 1) {
                resto -= 1;
                num1st++;
            }

            System.out.println("Резултат: ");
            System.out.println("Брой 2-леви монети: " + num2lv);
            System.out.println("Брой 1-леви монети: " + num1lv);
            System.out.println("Брой 50 стотинки: " + num50st);
            System.out.println("Брой 20 стотинки: " + num20st);
            System.out.println("Брой 10 стотинки: " + num10st);
            System.out.println("Брой 5 стотинки: " + num5st);
            System.out.println("Брой 2 стотинки: " + num2st);
            System.out.println("Брой 1 стотинка: " + num1st);
            System.out.println("Общ брой монети: " + (num2lv + num1lv + num50st + num20st + num10st + num5st + num2st + num1st));
        } catch (Exception e) {
            System.out.println("Грешка при въвеждането на данните. Моля, въведете число.");
        } finally {
            scanner.close();
        }
    }
}
