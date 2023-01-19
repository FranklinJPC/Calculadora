import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("calculator");
        frame.setContentPane(new calculator().panelCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}