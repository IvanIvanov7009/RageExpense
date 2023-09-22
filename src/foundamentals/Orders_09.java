package foundamentals;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());

            double sum=0;
            double totalSum =0;

        for (int i = 1; i <=n ; i++) {
            double pricePerCapsule= Double.parseDouble(sc.nextLine());
            int days= Integer.parseInt(sc.nextLine());
            int capsulesCount= Integer.parseInt(sc.nextLine());
            sum = ((days*capsulesCount)*pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.02f%n",sum);
            totalSum=totalSum+sum;

        }


        System.out.printf("Total: $%.02f",totalSum);


    }
}
