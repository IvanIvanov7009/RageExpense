import java.util.Scanner;

public class FruitorVegetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        switch (product) {//banana, apple, kiwi, cherry, lemon и grapes
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
                //tomato, cucumber, pepper и carrot
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;


            default:
                System.out.println("unknown");
        }
    }
}
