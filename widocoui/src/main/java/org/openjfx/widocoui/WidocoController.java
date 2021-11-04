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
   private Button nextButton,prevButton,setup1,setup2,setup3,setup4,setup5;

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
       printSetup();
   }

   public void prevEvent(ActionEvent event) {
       System.out.println("Prev Button Clicked!");

       removeSetup();
       printSetup();
   }

   public void event1(ActionEvent event) {
       System.out.println("Button 1 Clicked!");

       setup = 1;
       printSetup();
   }

   public void event2(ActionEvent event) {
       System.out.println("Button 2 Clicked!");

       setup = 2;
       printSetup();
   }

   public void event3(ActionEvent event) {
       System.out.println("Button 3 Clicked!");

       setup = 3;
       printSetup();
   }

   public void event4(ActionEvent event) {
       System.out.println("Button 4 Clicked!");

       setup = 4;
       printSetup();
   }

   public void event5(ActionEvent event) {
       System.out.println("Button 5 Clicked!");

       setup = 5;
       printSetup();
   }

   public void printSetup() {
	   if (setup == 1) {
		   prevButton.setVisible(false);
	   } else {
		   prevButton.setVisible(true);
	   }
	   
	   if (setup == 5) {
		   nextButton.setText("Finalizar");
	   } else {
		   nextButton.setText("Siguiente");
	   }
	   
	   
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

