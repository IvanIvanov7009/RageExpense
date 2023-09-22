package PreExam_13_08_2023_;

import java.util.Scanner;

public class _02_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = Double.parseDouble(sc.nextLine());
        int lovMes = Integer.parseInt(sc.nextLine());
        int rose = Integer.parseInt(sc.nextLine());
        int keyHolder = Integer.parseInt(sc.nextLine());
        int caricaturе = Integer.parseInt(sc.nextLine());
        int luckSupr = Integer.parseInt(sc.nextLine());
        double totalSum=0;
        double  discountPrice=0;
        double finalePrice=0;
        double discount= 0.65;
        double hosting = 0.10;
        double profit = 0;
        double numberOfArticuls =0;
         totalSum=lovMes*0.60+rose*7.20+keyHolder*3.60+caricaturе*18.20+luckSupr*22;
         numberOfArticuls=lovMes+rose+keyHolder+caricaturе+luckSupr;
         if(numberOfArticuls>=25){
             discountPrice=totalSum-(totalSum*discount);
         }
          finalePrice=totalSum-discountPrice;
         hosting=finalePrice*hosting;
         profit=finalePrice-hosting;
         if(profit>price){
             System.out.printf("Yes! %.2f lv left.",profit-price);

                      } else{
             System.out.printf("Not enough money! %.2f lv needed.",Math.abs(profit-price));
         }




    }
}
