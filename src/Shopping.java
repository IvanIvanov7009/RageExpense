import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double budjet = Double.parseDouble(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int p = Integer.parseInt(sc.nextLine());

        double vn = n*250;// video karti
        double pm = m*(vn*35/100.0);//procesori
        double pp = p*(vn*10/100.0);//pamet

        double finpr =vn+pm+pp;
        if (n>m) {
            finpr=finpr-finpr*15/100;
        }
        double dif =Math.abs(budjet-finpr);

             if(budjet>= finpr ){
                 System.out.printf("You have %.2f leva left! ",dif);

             }else {
                 System.out.printf("Not enough money! You need %.02f leva more!",dif);
             }
    }
}
