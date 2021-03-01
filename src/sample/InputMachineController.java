package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class InputMachineController implements Initializable {

    @FXML
    Pane pane;

    @FXML
    GridPane gridPane;

    @FXML
    TextField textField;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        int count = 0;
        int j = 0;
        for(int i = 1; i < 10; i++){
            if(count == 3){
                count = 0;
                j++;
            }
            Button button = new Button(Integer.toString(i));
            button.setPrefSize(50, 50);
            button.setOnAction(e -> textField.setText(textField.getText() + button.getText()));
            gridPane.add(button, count, j);
            count++;
        }
    }

}
