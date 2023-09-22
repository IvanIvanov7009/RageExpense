import java.util.Scanner;

public class PrimeSumNonPrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int PrimeNumSum=0;
        int NonPrimeNumSum=0;
        String input = sc.nextLine();
        while (!"stop".equalsIgnoreCase(input)){
            int num = Integer.parseInt(input);
            if (num<0){
                System.out.println("Number is negative.");
                input = sc.nextLine();
                continue;
            }

            boolean isPrime = true;
            for (int i = 2; i < num ; i++) {// int i=2; i<=num/2;i++ същото но пестим половината завъртания
                if (num%i==0){
                    isPrime = false;
                    break;
                }

            }
                if(isPrime){
                    PrimeNumSum+=num;
                } else {
                    NonPrimeNumSum+=num;
                }


            input = sc.nextLine();
        }


          System.out.printf("Sum of all prime numbers is: %d%n",PrimeNumSum);
          System.out.printf("Sum of all non prime numbers is: %d%n",NonPrimeNumSum);


    }
}
