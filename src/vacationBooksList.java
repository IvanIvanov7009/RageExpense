import java.util.Scanner;
    import java.util.Scanner;

    public class vacationBooksList {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int pageBook = Integer.parseInt(scanner.nextLine());
            int pagePerhour = Integer.parseInt(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());

            int timeforbook=pageBook/pagePerhour;
            int daysallbook=timeforbook/days;

            System.out.println(daysallbook);
        }
    }


