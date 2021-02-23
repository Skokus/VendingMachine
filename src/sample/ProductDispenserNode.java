package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductDispenserNode implements Initializable {

    @FXML public Pane group;
    @FXML public ImageView image;
    @FXML public TextField id;
    @FXML public TextField price;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        TextFormat(this.id);
        TextFormat(this.price);
    }

    public Pane getGroup(){
        return group;
    }

    private void TextFormat(TextField text){
        text.setEditable(false);
        text.setFocusTraversable(false);
        text.setMouseTransparent(true);
    }

    public void setId(String id){
        this.id.setText(id);
    }

    public void setPrice(String price){
        this.price.setText(price);
    }

    public void setImage(Image image){
        this.image.setImage(image);
    }
}
