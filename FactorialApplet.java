import java.applet.Applet;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialApplet extends Applet implements ActionListener {
    private TextField inputField;
    private TextField resultField;
    private Button calculateButton;

    public void init() {
        inputField = new TextField(10);
        resultField = new TextField(20);
        resultField.setEditable(false);
        calculateButton = new Button("Calculate Factorial");

        add(inputField);
        add(calculateButton);
        add(resultField);

        calculateButton.addActionListener(this);
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
}
