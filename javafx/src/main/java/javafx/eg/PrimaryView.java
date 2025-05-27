package javafx.eg;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class PrimaryView {

    public static VBox load() {
        Label label = new Label("This is the Primary View");
        Button button = new Button("Go to Secondary View");
        button.setOnAction(PrimaryEventHandler.getPrimaryButtonHandler());

        VBox layout = new VBox(15, label, button);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");
        return layout;
    }
}
