package javafx.eg;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class PrimaryEventHandler {

    public static EventHandler<ActionEvent> getPrimaryButtonHandler() {
        return e -> App.setRoot("secondary");
    }

    public static EventHandler<ActionEvent> getSecondaryButtonHandler() {
        return e -> App.setRoot("primary");
    }
}
