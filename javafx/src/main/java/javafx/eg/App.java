package javafx.eg;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) {
        scene = new Scene(PrimaryView.load(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("JavaFX Event Handler Demo");
        stage.show();
    }

    public static void setRoot(String viewName) {
        if ("primary".equals(viewName)) {
            scene.setRoot(PrimaryView.load());
        } else if ("secondary".equals(viewName)) {
            scene.setRoot(SecondaryView.load());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
