import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city =sc.nextLine();
        double volOfSales=Double.parseDouble(sc.nextLine());
        double com =0.0;
        boolean valid = true;
        switch ( city){
            case "Sofia":
                if(volOfSales>=0 && volOfSales<=500 ) {
                    com=0.05;
                } else if (volOfSales>500 && volOfSales<=1000) {
                    com=0.07;
                } else if (volOfSales>1000 && volOfSales<=10000) {
                    com=0.08;
                } else if (volOfSales>10000) {
                    com=0.12;
                } else {
                    valid= false;
                }
                break;
            case "Varna":
                if(volOfSales>=0 && volOfSales<=500 ) {
                    com=0.045;
                } else if (volOfSales>500 && volOfSales<=1000) {
                    com=0.075;
                } else if (volOfSales>1000 && volOfSales<=10000) {
                    com=0.10;
                } else if (volOfSales>10000) {
                    com=0.13;
                } else {
                    valid= false;
                }
                break;
            case"Plovdiv":
                if(volOfSales>=0 && volOfSales<=500 ) {
                    com=0.055;
                } else if (volOfSales>500 && volOfSales<=1000) {
                    com=0.08;
                } else if (volOfSales>1000 && volOfSales<=10000) {
                    com=0.12;
                } else if (volOfSales>10000) {
                    com=0.145;
                } else {
                    valid= false;
                }
                break;
            default:
                valid = false;
        }
        if (valid) {
            double totalPrice = volOfSales * com;
            System.out.printf("%.2f", totalPrice);
        } else {
            System.out.println("error");
        }

    }





 //   Град 0 ≤ s ≤ 500   500 < s ≤ 1 000   1 000 < s ≤ 10 000   s > 10 000

   // Sofia    5%              7%                   8%            12%

    //Varna    4.5%            7.5%                10%            13%

    //Plovdiv 5.5%              8%                  12%           14.5%



}
