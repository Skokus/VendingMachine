package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class Controller {
    
    @FXML public GridPane pdisconteiner;

    public void initialize() throws Exception {
        int count = 0;
        int j = 0;
        for(int i = 0; i < Data.productDispensers.size(); i++){
            if(count == 5){
                count = 0;
                j++;
            }
            FXMLLoader loader = new FXMLLoader(getClass().getResource("productdispenser.fxml"));
            Pane pane = loader.load();
            ProductDispenser productDispenser = Data.productDispensers.get(i);
            ProductDispenserNode controller = loader.getController();
            controller.setId(Integer.toString(productDispenser.getProduct().getId()));
            controller.setPrice(Double.toString(productDispenser.getProduct().getPrice()));
            controller.setImage(new Image(getClass().getResource(productDispenser.getImageURL()).toExternalForm()));
            pdisconteiner.add(pane, count, j);
            count++;
        }
    }
}
