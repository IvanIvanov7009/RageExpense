import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int chiken = Integer.parseInt(scaner.nextLine());
        int fish = Integer.parseInt(scaner.nextLine());
        int veget = Integer.parseInt(scaner.nextLine());

        double chikenPrice = chiken*10.35;
        double fishPrice = fish*12.40;
        double vegetPrice = veget*8.15;
        double allprice = chikenPrice+fishPrice+vegetPrice;
        double desert = allprice*0.2;

        System.out.println(allprice+desert+2.5);


    }
}
