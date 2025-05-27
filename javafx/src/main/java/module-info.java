module javafx.eg {
    requires javafx.controls;
    requires javafx.fxml;

    opens javafx.eg to javafx.fxml;
    exports javafx.eg;
}
