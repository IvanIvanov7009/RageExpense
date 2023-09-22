import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int voweSum = 0;
        for (int index = 0; index < name.length(); index++) {
            char symbol = name.charAt(index);
            switch (symbol){
                case 'a':
                    voweSum= voweSum+1;
                    break;
                case 'e':
                    voweSum=voweSum+2;
                    break;
                case 'i':
                    voweSum = voweSum+3;
                    break;
                case 'o':
                    voweSum=voweSum+4;
                    break;
                case 'u':
                    voweSum=voweSum+5;
                    break;
            }
        }
        System.out.println(voweSum);
    }
}
