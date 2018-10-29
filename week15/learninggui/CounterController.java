package week15.learninggui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CounterController {

	@FXML Label labelMessage;
	@FXML TextField textFieldMessage;
	
	@FXML public void printMessage() {
		String message = textFieldMessage.getText();
		labelMessage.setText(message);
	}

}
