package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class ProductDispenserNode extends Parent {

    public Group group;
    public ProductDispenser productDispenser;
    public ImageView image;
    public TextField id;
    public TextField price;

    public ProductDispenserNode(ProductDispenser productDispenser, String imageurl) throws Exception{
        group = new Group();
        image = new ImageView();
        image.setFitWidth(100);
        image.setFitHeight(100);
        image.setImage(new Image(getClass().getResource(imageurl).toExternalForm()));
        group.getChildren().add(image);
        id = new TextField();
        id.setText(Integer.toString(productDispenser.getProduct().getId()));
        id.setEditable(false);
        id.setMaxWidth(50);
        id.setMaxHeight(25);
        id.setLayoutY(100);
        group.getChildren().add(id);
        price = new TextField();
        price.setText(String.format("%.2f", productDispenser.getProduct().getPrice()));
        price.setEditable(false);
        price.setMaxWidth(50);
        price.setMaxHeight(25);
        price.setLayoutY(100);
        price.setLayoutX(50);
        group.getChildren().add(price);
    }

    public Group getGroup(){
        return group;
    }
}
