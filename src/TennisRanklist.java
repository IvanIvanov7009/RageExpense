import java.util.Scanner;


public class TennisRanklist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int points = Integer.parseInt(sc.nextLine());
        int totpoints=points;
        int winper=0;
        double averagePoints=0;

        for (int i = 0; i <n ; i++) {
            String turnir = sc.nextLine();

            switch (turnir){
                case "W":
                 totpoints=totpoints+2000;
                 winper=winper+1;
                 break;
                case "F":
                    totpoints=totpoints+1200;
                    break;
                case "SF":
                    totpoints=totpoints+720;
                    break;
            }
        }
        averagePoints = Math.floor((double) totpoints-(double) points/n);
        System.out.println("Final points: "+totpoints);
        System.out.printf("Average points: %.0f%n",averagePoints);
        System.out.printf("%.2f%%",(double)winper/n*100);


    }
}
