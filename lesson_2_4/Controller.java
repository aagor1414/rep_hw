package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.util.Date;

public class Controller {

    @FXML
    private TextField chatTextField;

    @FXML
    private TextField messageTextField;

    @FXML
    private Button sendMessageButton;

    @FXML
    private TextArea chatTextArea;


    @FXML
    void sendMessage() {

        Date date = new Date();
        String message = messageTextField.getText();
        messageTextField.clear();
        chatTextArea.appendText("You:  " + message + "    \n" + date.toString() + "\n" + "\n");

    }

}

