import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
         int sum =0;
        for (int i = 1; i <=n ; i++) {
            int numbers = Integer.parseInt(sc.nextLine());
            sum=sum+ numbers;
        }
        System.out.println(sum);
    }
}
