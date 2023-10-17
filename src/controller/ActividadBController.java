package controller;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Persona;

public class ActividadBController implements Initializable{

	@FXML
	private Button btnAgregar;
	
	@FXML
    private TableView<Persona> tblTabla;
	
	@FXML
	private TableColumn<Persona, String> tblApellidos;
	
	@FXML
	private TableColumn<Persona, Integer> tblEdad;
	
	@FXML
	private TableColumn<Persona, String> tblNombre;
	
	@FXML
	private TextField txtApellidos;
	
	@FXML
	private TextField txtEdad;
	
	@FXML
	private TextField txtNombre;
	
	private ObservableList<Persona> listaPersonas = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listaPersonas.add(new Persona("antonio", "perez", 10));
		tblTabla.setItems(listaPersonas);
		
	}
	
	@FXML
	public void insertar() {
		try {
			Persona p = new Persona(txtEdad.getText(), txtApellidos.getText(), Integer.parseInt(txtEdad.getText()));
			// Lanzar exepciones en caso de que el formato de la edad no sea correcto o sea nulo			
			
			ObservableList<Persona> listaPersonas = tblTabla.getItems();
			if (listaPersonas.contains(p)== false) {
				listaPersonas.add(p);
			}		
		}catch(NumberFormatException e){
			Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Escriba una edad real");
            alert.setContentText("La edad tiene que ser un entero positivo");
            alert.showAndWait();
		}
		
		
		
		
	}

	
}
