import javax.swing.*;

public class ShowFrame {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        String myTitle = "Празна бланка в която може да се добавя.";
        myFrame.setTitle(myTitle);
        myFrame.setSize(1000,800);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
           System.out.println("hello");
    }
}
