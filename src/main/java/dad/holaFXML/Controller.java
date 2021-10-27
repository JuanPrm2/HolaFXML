package dad.holaFXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;

public class Controller implements Initializable{

	StringProperty nombreProperty= new SimpleStringProperty();
	
	//view
	@FXML
	private VBox root;
	
	@FXML
	private TextField textFieldNombre;
	
	@FXML
	private Button botonSaludo;
	
	@FXML
	private Label saludoLabel;
	public Controller() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}
	public VBox getView() {
		return root;

	}
	
	public void initialize(URL location, ResourceBundle resources) {
		String nombre= textFieldNombre.getText();
		
		nombreProperty.bind(textFieldNombre.textProperty());
		
	}
	@FXML
	private void onClick(ActionEvent e) {
		saludoLabel.setStyle("-fx-text-fill:red;-fx-font:bold 40 consolas;");
		saludoLabel.setText("Hola "+ textFieldNombre.getText());
		
	}

}
