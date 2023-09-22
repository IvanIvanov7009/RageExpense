
import java.util.Scanner;

public class FishingBoatToo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int numberOfPeople = Integer.parseInt(sc.nextLine());

        double rent = 0.0;
        boolean range1 = numberOfPeople <= 6;
        boolean range2 =  numberOfPeople <= 11;

        switch (season) {
            case "Spring":
                rent = 3000;
                if (range1) {
                    rent = rent - (rent * 10 / 100);
                } else if (range2) {
                    rent = rent - (rent * 15 / 100);
                } else {
                    rent = rent - (rent * 25 / 100);
                }
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                if (range1) {
                    rent = rent - (rent * 10 / 100);
                } else if (range2) {
                    rent = rent - (rent * 15 / 100);
                } else {
                    rent = rent - (rent * 25 / 100);
                }
                break;
            case "Winter":
                rent = 2600;
                if (range1) {
                    rent = rent - (rent * 10 / 100);
                } else if (range2) {
                    rent = rent - (rent * 15 / 100);
                } else {
                    rent = rent - (rent * 25 / 100);
                }
                break;

            default:
               System.out.println("Invalid season");
        }

        if (numberOfPeople % 2 == 0 && !season.equals("Autumn")) {
            rent = rent - (rent * 5 / 100);
        }
        double rest = Math.abs(budget - rent);
        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", rest);
        } else {
            rest = rent - budget;
            System.out.printf("Not enough money! You need %.2f leva.", rest);
        }
    }
}












