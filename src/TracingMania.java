import java.util.Scanner;

public class TracingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int mus = 0, Montblan =0, k2 = 0,Kiliman = 0,everest =0;
        int sumOfPiple = 0;

        for (int i = 0; i < n ; i++) {

            int num = Integer.parseInt(sc.nextLine());

            if (num <=5  ){
               mus = mus+num;
            } else if ( num <=12  ) {
                Montblan=Montblan+num;

            } else if ( num<= 25 ) {
                Kiliman= Kiliman+num;
            } else if ( num<=40 ) {
                k2=k2+ num;
            } else  {
                everest=everest+num;
            }
            sumOfPiple +=num;
        }
        System.out.printf("%.2f%%%n",(double)mus/sumOfPiple*100);
        System.out.printf("%.2f%%%n",(double)Montblan/sumOfPiple*100);
        System.out.printf("%.2f%%%n",(double)Kiliman/sumOfPiple*100);
        System.out.printf("%.2f%%%n",(double)k2/sumOfPiple*100);
        System.out.printf("%.2f%%%n",(double)everest/sumOfPiple*100);


        }

    }

