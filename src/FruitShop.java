import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  fruit= sc.nextLine();
        String  dayOfWeek= sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        double price = 0;

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday"://orange grapefruit kiwi pineapple grapes
            case "Friday":  //0.85 1.45 2.70 5.50 3.85
                if(fruit.equals("banana")){
                    price=quantity*2.50;                    
                } else if (fruit.equals("apple")) {
                    price=quantity*1.20;
                } else if (fruit.equals("orange")) {
                    price=quantity*0.85;
                } else if (fruit.equals("grapefruit")) {
                    price=quantity*1.45;
                } else if (fruit.equals("kiwi")) {
                    price=quantity*2.70;
                } else if (fruit.equals("pineapple")) {
                    price=quantity*5.50;
                } else if (fruit.equals("grapes")) {
                    price=quantity*3.85;
                }
                if (price>0) {
                    System.out.printf("%.2f", price);
                } else {System.out.println("error");}
                break;
            case "Saturday":
            case "Sunday":
                if(fruit.equals("banana")){
                    price=quantity*2.70;
                } else if (fruit.equals("apple")) {
                    price=quantity*1.25;
                } else if (fruit.equals("orange")) {
                    price=quantity*0.90;
                } else if (fruit.equals("grapefruit")) {
                    price=quantity*1.60;
                } else if (fruit.equals("kiwi")) {
                    price=quantity*3.00;
                } else if (fruit.equals("pineapple")) {
                    price=quantity*5.60;
                } else if (fruit.equals("grapes")) {
                    price=quantity*4.20;
                }
                if (price>0) {
                    System.out.printf("%.2f", price);
                } else {System.out.println("error");}

                break;
            default:
                System.out.println("error");
        }
    }
}
