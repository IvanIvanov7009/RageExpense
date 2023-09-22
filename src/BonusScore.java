import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double n=Double.parseDouble(sc.nextLine());
      double tocki=0;


      if (n<=100){
            tocki=5;
      } else if (n>1000) {
          tocki=n*10/100;
      } else {
        tocki = n * 20/100;
        }
       if(n % 2 == 0) {
        tocki = tocki+1;
       }
       if (n % 10 == 5) {
           tocki = tocki+2;
       }
       System.out.println(tocki);
       System.out.println(tocki+n);
    }
}
