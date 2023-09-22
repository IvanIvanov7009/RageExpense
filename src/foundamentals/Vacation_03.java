package foundamentals;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberofGrup=Integer.parseInt(sc.nextLine());
        String typeOfGroup = sc.nextLine();
        String dayOfWeek = sc.nextLine();
          double price =0;

        switch (typeOfGroup){
            case "Students":
                if(dayOfWeek.equalsIgnoreCase("Friday")){
                    price=numberofGrup*8.45;
            } else if (dayOfWeek.equalsIgnoreCase("Saturday")) {
                    price=numberofGrup*9.80;
                } else if (dayOfWeek.equalsIgnoreCase("Sunday")) {
                    price=numberofGrup*10.46;
                }
                if(numberofGrup>=30){
                    price=price-price*15/100;
                }
                System.out.printf("Total price: %.2f",price);
                break;
            case "Business":
                if(dayOfWeek.equalsIgnoreCase("Friday")){
                    price=numberofGrup*10.90;
                    if(numberofGrup>=100) {
                        price = price -  10*10.90;
                    }
                } else if (dayOfWeek.equalsIgnoreCase("Saturday")) {
                    price=numberofGrup*15.60;
                    if(numberofGrup>=100) {
                        price = price - 10*15.60;
                    }
                } else if (dayOfWeek.equalsIgnoreCase("Sunday")) {
                    price=numberofGrup*16.00;
                    if(numberofGrup>=100) {
                        price = price - 10*16;
                    }
                }
                System.out.printf("Total price: %.2f",price);
                break;
            case "Regular":
                if(dayOfWeek.equalsIgnoreCase("Friday")){
                    price=numberofGrup*15.00;
                } else if (dayOfWeek.equalsIgnoreCase("Saturday")) {
                    price=numberofGrup*20.00;
                } else if (dayOfWeek.equalsIgnoreCase("Sunday")) {
                    price=numberofGrup*22.50;
                }
                if(numberofGrup>=10 && numberofGrup<=20){
                    price=price-price*5/100;
                }
                System.out.printf("Total price: %.2f",price);
                break;

        }



    }
}
