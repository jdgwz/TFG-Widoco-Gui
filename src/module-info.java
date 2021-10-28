module WidocoGui {
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
	
	exports application;
}
