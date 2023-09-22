package Exam_19_08_2023_;

import java.util.Scanner;

public class Task_01_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int video=Integer.parseInt(sc.nextLine());
        int conector=Integer.parseInt(sc.nextLine());
        double powerDay =Double.parseDouble(sc.nextLine());
        double profitForDay =Double.parseDouble(sc.nextLine());

        int priceVideo= video*13;
        int priceConector = conector*13;
        double totalMoney = priceConector+priceVideo+1000;
        double profitDayCard=profitForDay-powerDay;
        Double totalProfit=13*profitDayCard;
        double totalDay =Math.ceil(totalMoney/totalProfit);
        System.out.printf("%.0f%n",totalMoney);
        System.out.printf("%.0f",totalDay);


    }
}
