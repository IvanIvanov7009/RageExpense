package foundamentals;
import java.util.Scanner;
public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int div = 0;
        for (int i = 0; i <= 10; i++) {
            if (i==2 || i==3 || i== 6 || i== 7 || i==10) {
                if (num%i==0) {
                    if (div<=i) {
                        div = i;
                    }
                }
            }

        }
        if (div != 0) {
            System.out.println("The number is divisible by " + div);
        } else {
            System.out.println("Not divisible");
        }
    }
}