module widocogui {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens org.openjfx.widocogui to javafx.fxml;
    exports org.openjfx.widocogui;
}
