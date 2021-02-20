package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
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
    public Button button;

    public ProductDispenserNode(ProductDispenser productDispenser, String imageurl) throws Exception{
        group = new Group();
        image = new ImageView();
        image.setFitWidth(100);
        image.setFitHeight(100);
        image.setImage(new Image(getClass().getResource(imageurl).toExternalForm()));
        group.getChildren().add(image);
        id = new TextField();
        TextFormat(id, Integer.toString(productDispenser.getProduct().getId()), 0, 100);
        group.getChildren().add(id);
        price = new TextField();
        TextFormat(price, String.format("%.2f", productDispenser.getProduct().getPrice()), 50, 100);
        group.getChildren().add(price);
        button = new Button("-");
        button.setLayoutY(130);
        group.getChildren().add(button);
        button.setOnAction(e -> productDispenser.removeProduct());
    }

    public Group getGroup(){
        return group;
    }

    private void TextFormat(TextField text, String input, int x, int y){
        text.setText(input);
        text.setEditable(false);
        text.setMaxWidth(50);
        text.setMaxHeight(25);
        text.setLayoutY(y);
        text.setLayoutX(x);
        text.setFocusTraversable(false);
        text.setMouseTransparent(true);
    }
}
