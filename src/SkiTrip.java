
import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();

        int nights = days - 1;
        double price = 0;

        switch (roomType) {
            case "room for one person":
                price = nights * 18;
                break;
            case "apartment":
                price = nights * 25;
                if (nights < 10) {
                    price = price - (price * 30 / 100);
                } else if (nights <= 15) {
                    price = price - (price * 35 / 100);
                } else {
                    price = price - (price * 50 / 100);
                }

                break;
            case "president apartment":
                price = nights * 35;
                if (nights < 10) {
                    price = price - (price * 10 / 100);
                } else if (nights <= 15) {
                    price = price - (price * 15 / 100);
                } else {
                    price = price - (price * 20 / 100);
                }

                break;
        }

        switch (review) {
            case "positive":
                price = price + (price * 25 / 100);
                break;
            case "negative":
                price = price - (price * 10 / 100);
                break;
        }

        System.out.printf("%.2f", price);
    }
}