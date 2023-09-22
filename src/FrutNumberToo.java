import java.util.Scanner;

public class FrutNumberToo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  fruit= sc.nextLine();
        String  dayOfWeek= sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        double price = 0.0;

        switch (dayOfWeek) {//orange grapefruit kiwi pineapple grapes
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {  //0.85 1.45 2.70 5.50 3.85
                switch (fruit) {
                    case "banana" -> price = quantity * 2.50;
                    case "apple" -> price = quantity * 1.20;
                    case "orange" -> price = quantity * 0.85;
                    case "grapefruit" -> price = quantity * 1.45;
                    case "kiwi" -> price = quantity * 2.70;
                    case "pineapple" -> price = quantity * 5.50;
                    case "grapes" -> price = quantity * 3.85;
                }
                System.out.printf("%.2f", price);
            }
            case "Saturday", "Sunday" -> {
                price = switch (fruit) {
                    case "banana" -> quantity * 2.70;
                    case "apple" -> quantity * 1.25;
                    case "orange" -> quantity * 0.90;
                    case "grapefruit" -> quantity * 1.60;
                    case "kiwi" -> quantity * 3.00;
                    case "pineapple" -> quantity * 5.60;
                    case "grapes" -> quantity * 4.20;
                    default -> price;
                };
                System.out.printf("%.2f", price);
            }
            default -> System.out.println("error");
        }
    }
}
