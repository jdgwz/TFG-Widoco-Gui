package org.openjfx.widocoui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class WidocoController implements Initializable {

   @FXML
   private Button nextButton,prevButton;

   @FXML
   private TextArea setupField;
   
   private int setup = 1;
   private final int LIMIT = 5;
   private String setupString = "1.";

   @Override
   public void initialize(URL location, ResourceBundle resources) {
       setupField.setText(setupString);
   }

   public void nextEvent(ActionEvent event) {
       System.out.println("Next Button Clicked!");

       addSetup();
       
       String printString = "";
       for (int i = 1; i <= setup; i++) {
    	   printString = printString + i + ".\n";
       }
       
        // Show in VIEW
       setupField.setText(printString);

   }

   public void prevEvent(ActionEvent event) {
       System.out.println("Prev Button Clicked!");

       removeSetup();
       
       String printString = "";
       for (int i = 1; i <= setup; i++) {
    	   printString = printString + i + ".\n";
       }
        // Show in VIEW
       setupField.setText(printString);

   }

	private void addSetup() {
		if (setup >= 1 && setup < LIMIT)
			setup = setup + 1;
	}

	private void removeSetup() {
		if (setup > 1 && setup <= LIMIT)
			setup = setup - 1;
	}

}

