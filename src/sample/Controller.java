package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends Object implements Initializable {

    @FXML
    public TextField resultTextField;
    @FXML
    private TextField firstNumberTextField;
    @FXML
    private TextField secondNumberTextField;

    @FXML
    private void handleAdditionAction(javafx.event.ActionEvent event) {
        double firstNumber = Double.parseDouble(firstNumberTextField.getText());
        double secondNumber = Double.parseDouble(secondNumberTextField.getText());
        double result = firstNumber + secondNumber;

        resultTextField.setText(String.valueOf(result));
    }

    @FXML
    private void handleMultiplicationAction(javafx.event.ActionEvent event) {
        double firstNumber = Double.parseDouble(firstNumberTextField.getText());
        double secondNumber = Double.parseDouble(secondNumberTextField.getText());
        double result = firstNumber * secondNumber;

        resultTextField.setText(String.valueOf(result));
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
