package foundamentals;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nGames = Integer.parseInt(sc.nextLine());

        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());
          int contH=0;
          int countM=0;
          int countK=0;
          int countD=0;
       // for (int i = 1; i <= nGames; i++) {
            //if(i%2==0){
                // contH++;
         //  }
           // if(i%3==0){
              //  countM++;
           // }

       // }
            contH=nGames/2;// втори начин
            countM=nGames/3;//втори начин

            countK=countM/2;
            countD=countK/2;
            double totalExpenses=contH*headsetPrice+countM*mousePrice+countK*keyboardPrice+countD*displayPrice;

        System.out.printf("Rage expenses: %.2f lv.%n",totalExpenses);






    }
}
