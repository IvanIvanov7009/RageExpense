import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int l= Integer.parseInt(scanner.nextLine());
        int w= Integer.parseInt(scanner.nextLine());
        int h= Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volume= l*w*h;
        double volumeL =volume*0.001;
        double vol =volumeL*(1-(percent/100));
        System.out.println(vol);
    }
}

