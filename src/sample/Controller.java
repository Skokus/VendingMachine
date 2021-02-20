package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Controller {

    public HBox hbox;
    public Button button;


    public void initialize() throws Exception {
        ProductDispenser productdispenser = new ProductDispenser(new Product(1, "PrincePolo", 1.00), 10);
        ProductDispenser productdispenser2 = new ProductDispenser(new Product(2, "CocaCola", 2.50), 10);
        hbox.getChildren().add(new ProductDispenserNode(productdispenser, "PrincePolo.png").getGroup());
        hbox.getChildren().add(new ProductDispenserNode(productdispenser2,"CocacolaCan.png").getGroup());
    }
}
