import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        if ( num1 % 2==0 ) {
        System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }

}
