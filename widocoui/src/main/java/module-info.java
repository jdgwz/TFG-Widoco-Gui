module org.openjfx.widocoui {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx.widocoui to javafx.fxml;
    exports org.openjfx.widocoui;
}
