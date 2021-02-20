package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class Controller {

    public HBox hbox;
    public VBox vbox;
    public Button button;
    private ArrayList<ProductDispenserNode> productdispensersnodes;

    public void initialize() throws Exception {

        productdispensersnodes = new ArrayList<ProductDispenserNode>();
        ProductDispenser princepolo = new ProductDispenser(new Product(1, "PrincePolo", 1.00), 10);
        ProductDispenser cocacola = new ProductDispenser(new Product(2, "CocaCola", 2.00), 10);
        ProductDispenser twix = new ProductDispenser(new Product(3, "Twix", 2.50), 10);
        ProductDispenser haribo = new ProductDispenser(new Product(4, "Haribo", 5.00), 10);
        ProductDispenser kitkat = new ProductDispenser(new Product(5, "KitKat", 2.00), 10);
        ProductDispenser mars = new ProductDispenser(new Product(6, "Mars", 2.50), 10);
        ProductDispenser milkyway = new ProductDispenser(new Product(7, "MilkyWay", 2.50), 10);

        productdispensersnodes.add(new ProductDispenserNode(princepolo, "photos/PrincePolo.png"));
        productdispensersnodes.add(new ProductDispenserNode(cocacola,"photos/CocacolaCan.png"));
        productdispensersnodes.add(new ProductDispenserNode(twix,"photos/Twix.png"));
        productdispensersnodes.add(new ProductDispenserNode(haribo,"photos/HariboSmakRadości.png"));
        productdispensersnodes.add(new ProductDispenserNode(kitkat,"photos/Kitkat.png"));
        productdispensersnodes.add(new ProductDispenserNode(mars,"photos/Mars.png"));
        productdispensersnodes.add(new ProductDispenserNode(milkyway,"photos/Milkyway.png"));

        int count = 0;
        HBox newhbox = new HBox();
        vbox.getChildren().add(newhbox);
        newhbox.setPrefWidth(100);
        newhbox.setPrefHeight(100);
        for(int i = 0; i < productdispensersnodes.size(); i++){
            if(count == 5){
                newhbox = new HBox();
                newhbox.setPrefWidth(100);
                newhbox.setPrefHeight(100);
                vbox.getChildren().add(newhbox);
                count = 0;
            }
            newhbox.getChildren().add(productdispensersnodes.get(i).getGroup());
            count++;
        }
    }
}
