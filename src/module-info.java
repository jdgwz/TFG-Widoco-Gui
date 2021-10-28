module widocogui {
	requires transitive javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens org.openjfx to javafx.fxml;
	
	exports org.openjfx;
}