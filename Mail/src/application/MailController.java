package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class MailController {

	@FXML
	private Label application;
	@FXML
	private Label NbrMail;
	@FXML
	private Label NbrMailBloque;
	@FXML
	private Label PourcentageBloque;
	
	@FXML
	public void initialize() {
		NbrMail.setText(null);
		NbrMailBloque.setText(null);
		PourcentageBloque.setText(null);
		application.setText("R&R Mail");
	}
}
