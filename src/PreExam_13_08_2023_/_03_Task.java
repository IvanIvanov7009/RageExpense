package PreExam_13_08_2023_;

import java.util.Scanner;

public class _03_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPiple = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        double price = 0;

        switch (season) {
            case "spring":
                if (numberOfPiple <= 5) {
                 price=numberOfPiple*50.00;

                } else{
                    price=numberOfPiple*48.00;
                }
                break;
            case "summer":
                if (numberOfPiple <= 5) {
                    price=numberOfPiple*48.50;
                    price= price-(price*0.15);
                } else{
                    price=numberOfPiple*45.00;
                    price= price-(price*0.15);
                }
                break;
            case "autumn":
                if (numberOfPiple <= 5) {
                    price=numberOfPiple*60.00;

                } else{
                    price=numberOfPiple*49.50;
                }
                break;
            case "winter":
                if (numberOfPiple <= 5) {
                    price=numberOfPiple*86.00;
                    price=price+(price*0.08);
                } else{
                    price=numberOfPiple*85.00;
                    price=price+(price*0.08);
                }
                break;
        }
              System.out.printf("%.02f leva.",price);

    }
}
