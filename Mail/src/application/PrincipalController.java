package application;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PrincipalController {

	@FXML
	private Label application;
	@FXML
	private TextField mail;
	@FXML
	private Button Connecter;

	@FXML
	public void initialize() {
		application.setText("R&R Mail");
		Button myButton = this.Connecter;
		myButton.getStyleClass().add("my-button-style");
		Label appli = this.application;
		appli.getStyleClass().add(null);
	}

	@FXML
	private void ClicConnecter(ActionEvent evt) {
		if (!(mail.getText() == "")) {
			mail.getText();
			try {
				Parent root;
				Stage personnalisation = new Stage();
				FXMLLoader loader = new FXMLLoader(getClass().getResource("Mail.fxml"));

				root = loader.load();
				root.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				personnalisation.setScene(new Scene(root));
				personnalisation.setTitle("Mail");
				personnalisation.initModality(Modality.WINDOW_MODAL);
				personnalisation.initOwner(((Node) evt.getSource()).getScene().getWindow());
				personnalisation.show();
			} catch (IOException e) {
				System.out.println("Probleme lors de" + " la création de l'interface");
			}

		} else {
			Alert boiteAlert = new Alert(AlertType.INFORMATION);
			boiteAlert.setTitle("Adresse Inexistante");
			boiteAlert.setHeaderText("Merci de remplir le champ de saisi.");
			Platform.runLater(boiteAlert::showAndWait);
		}
	}

}
