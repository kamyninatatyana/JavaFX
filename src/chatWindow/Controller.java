package chatWindow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    public TextField yourMessageWindow;
    @FXML
    public Button sendButton;
    @FXML
    public TextArea chatWindow;
    @FXML
    public TextArea chattersList;

    public void clickButtonSend() {
        chatWindow.appendText(yourMessageWindow.getText() + "\n");
        yourMessageWindow.clear();
        yourMessageWindow.requestFocus();
    }


    public void clickEnter(KeyEvent keyEvent) {
        if(keyEvent.getCode() == KeyCode.ENTER) {
            chatWindow.appendText(yourMessageWindow.getText() + "\n");
            yourMessageWindow.clear();
            yourMessageWindow.requestFocus();
        }
    }
}
