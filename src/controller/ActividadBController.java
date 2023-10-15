package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class ActividadBController implements Initializable{

	@FXML
	private Button btnAgregar;
	
	@FXML
	private TableColumn<?, ?> tblApellidos;
	
	@FXML
	private TableColumn<?, ?> tblEdad;
	
	@FXML
	private TableColumn<?, ?> tblNombre;
	
	@FXML
	private TextField txtApellidos;
	
	@FXML
	private TextField txtEdad;
	
	@FXML
	private TextField txtNombre;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	
}
