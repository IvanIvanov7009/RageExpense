package PreExam_13_08_2023_;

import java.util.Scanner;

public class _05_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 5364;
        int countDay=1;
        int meterFinale = start;
        int newCountDay=0;

        String input =sc.nextLine();
        while (!input.equalsIgnoreCase("END")){

            if (input.equalsIgnoreCase("YES")) {
                countDay=countDay+1;
            } else if(input.equalsIgnoreCase("no")) {
                newCountDay=newCountDay+1;
            }

            int meter = Integer.parseInt(sc.nextLine());
            meterFinale=meterFinale+meter;

            if(countDay==5 ||newCountDay==5 ||meterFinale>=8848){
                break;

            }

            input=sc.nextLine();

        }
        if (meterFinale>=8848){
            System.out.printf("Goal reached for %d days!%n",countDay);

        }else {
            System.out.println("Failed!");
            System.out.println(meterFinale);

        }


    }
}
