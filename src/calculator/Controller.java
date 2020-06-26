package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    public javafx.scene.control.Button btn0;
    @FXML
    public javafx.scene.control.Button btn1;
    @FXML
    public javafx.scene.control.Button btn2;
    @FXML
    public javafx.scene.control.Button btn3;
    @FXML
    public javafx.scene.control.Button btn4;
    @FXML
    public javafx.scene.control.Button btn5;
    @FXML
    public javafx.scene.control.Button btn6;
    @FXML
    public javafx.scene.control.Button btn7;
    @FXML
    public javafx.scene.control.Button btn8;
    @FXML
    public javafx.scene.control.Button btn9;
    @FXML
    public javafx.scene.control.Button btnEql;
    @FXML
    public javafx.scene.control.Button btnPlus;
    @FXML
    public javafx.scene.control.Button btnMinus;
    @FXML
    public javafx.scene.control.Button btnMultiply;
    @FXML
    public javafx.scene.control.Button btnDiv;
    @FXML
    public javafx.scene.control.Button btnPoint;
    @FXML
    public javafx.scene.control.Button btnC;
    @FXML
    public javafx.scene.control.Button btnBack;
    @FXML
    public javafx.scene.control.TextField textField;

    String textFromDisplay;
    String enteredText;
    char selectedAction;
    double var1;
    double var2;
    double result;

    public void clickButton(ActionEvent actionEvent) {
        if (actionEvent.getSource() instanceof Button && actionEvent.getSource() != btnDiv &&
                actionEvent.getSource() != btnEql && actionEvent.getSource() != btnMinus
                && actionEvent.getSource() != btnMultiply && actionEvent.getSource() != btnPlus
                && actionEvent.getSource() != btnBack && actionEvent.getSource() != btnC) {

            textFromDisplay = ((Button) actionEvent.getSource()).getText();
            textField.setText(textField.getText() + textFromDisplay);
        }

        if (actionEvent.getSource() == btnC) {
            textField.clear();
        }

        if (actionEvent.getSource() == btnBack) {
            if (textField.getText().length() > 1)
                textField.setText(textField.getText(0, textField.getText().length() - 1));
            else {
                textField.clear();
            }
        }

        if (actionEvent.getSource() == btnPlus) {
            enteredText = textField.getText();
            textField.clear();
            selectedAction = '+';

        }

        if (actionEvent.getSource() == btnMinus) {
            enteredText = textField.getText();
            textField.clear();
            selectedAction = '-';
        }
        if (actionEvent.getSource() == btnMultiply) {
            enteredText = textField.getText();
            textField.clear();
            selectedAction = '*';
        }
        if (actionEvent.getSource() == btnDiv) {
            enteredText = textField.getText();
            textField.clear();
            selectedAction = '/';
        }
        try {
            if (actionEvent.getSource() == btnEql) {
                var1 = Double.parseDouble(enteredText);
                var2 = Double.parseDouble(textField.getText());

                switch (selectedAction) {
                    case '+':
                        result = var1 + var2;
                        textField.setText(result + "");
                        break;
                    case '-':
                        result = var1 - var2;
                        textField.setText(result + "");
                        break;
                    case '*':
                        result = var1 * var2;
                        textField.setText(result + "");
                        break;
                    case '/':
                        result = var1 / var2;
                        textField.setText(result + "");
                        break;
                }

            }
        } catch (RuntimeException e) {
            textField.clear();
        }
    }
}

