import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
       // for (int i = 0; i <= n ; i++) { varian 1
         //   if(i % 2 == 0){
           //     System.out.println(Math.pow(2,i));

           // }

        //}
        for (int i = 0; i <=n ; i+=2) {
            System.out.printf("%.0f%n",Math.pow(2,i));// variant 2

        }
    }
}
