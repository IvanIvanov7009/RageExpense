import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        int sumOdd = 0;
        int sumEvan = 0;


        for (int i = 1; i <=n ; i++) {
            int numb = Integer.parseInt(sc.nextLine());
             if (i % 2 == 0){
                 sumOdd = sumOdd + numb;
        } else {
                 sumEvan = sumEvan + numb;
             }
        }
        sum = Math.abs(sumEvan-sumOdd);
         if (sumEvan == sumOdd ){
             System.out.println("Yes");
             System.out.println("Sum = "+sumOdd);
         } else {
             System.out.println("No");
             System.out.println("Diff = "+ sum);
         }
    }
}
