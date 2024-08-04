import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialSwing extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextField resultField;
    private JButton calculateButton;

    public FactorialSwing() {
        inputField = new JTextField(10);
        resultField = new JTextField(20);
        resultField.setEditable(false);
        calculateButton = new JButton("Calculate Factorial");

        setLayout(new java.awt.FlowLayout());
        add(inputField);
        add(calculateButton);
        add(resultField);

        calculateButton.addActionListener(this);

        setTitle("Factorial Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(inputField.getText());
            int result = factorial(number);
            resultField.setText("Factorial: " + result);
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input!");
        }
    }

    private int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        new FactorialSwing();
    }
}
