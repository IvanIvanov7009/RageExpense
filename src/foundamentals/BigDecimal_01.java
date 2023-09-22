

package foundamentals;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimal_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= Integer.parseInt(sc.nextLine());

        BigDecimal result= new BigDecimal("0");
        for (int i = 0; i < n; i++) {
             BigDecimal number = new BigDecimal(sc.nextLine());
             result=result.add(number);
        }

        System.out.println("The result is   "+result);

    }

}
