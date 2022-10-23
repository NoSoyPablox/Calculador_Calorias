/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package calculadorcalorias;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author Pablo
 */
public class FXMLCalculadoraCaloriasController implements Initializable {
    
    @FXML
    private RadioButton rbPocaActividad;
    @FXML
    private RadioButton rbEjercicioLigero;
    @FXML
    private RadioButton rbEjercicioModerado;
    @FXML
    private RadioButton rbDeporteRegular;
    @FXML
    private RadioButton rbDeportistaElite;
    @FXML
    private ComboBox cbGenero;
    @FXML
    private ComboBox cbEdad;
    @FXML
    private TextField tfEstatura;
    @FXML
    private TextField tfPesoActual;
    @FXML
    private Button calcular;
    @FXML
    private Label lbCalorias;

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    //Permiten la seleccion unica de las opciones de actividad fisica
    @FXML
    private void clicPocaActividad(ActionEvent e){
        rbEjercicioLigero.setSelected(false);
        rbEjercicioModerado.setSelected(false);
        rbDeporteRegular.setSelected(false);
        rbDeportistaElite.setSelected(false); 
    }

    @FXML
    private void clicEjercioLigero(ActionEvent e){
        rbPocaActividad.setSelected(false);
        rbEjercicioModerado.setSelected(false);
        rbDeporteRegular.setSelected(false);
        rbDeportistaElite.setSelected(false); 
    }

    @FXML
    private void clicEjercicioModerado(ActionEvent e){
        rbPocaActividad.setSelected(false);
        rbEjercicioLigero.setSelected(false);
        rbDeporteRegular.setSelected(false);
        rbDeportistaElite.setSelected(false); 
    }

    @FXML
    private void clicDeporteRegular(ActionEvent e){
        rbPocaActividad.setSelected(false);
        rbEjercicioLigero.setSelected(false);
        rbEjercicioModerado.setSelected(false);
        rbDeportistaElite.setSelected(false); 
    }

    @FXML
    private void clicDeportistaElite(ActionEvent e){
        rbPocaActividad.setSelected(false);
        rbEjercicioLigero.setSelected(false);
        rbEjercicioModerado.setSelected(false);
        rbDeporteRegular.setSelected(false); 
    }

    @FXML
    private void calcularCalorias (ActionEvent e){
        //calculo de calorias
    }

    //Recibe el calculo obtenido
    private void mostrarCalorias (int cal){
        lbCalorias.setText(cal+" Kcal");
    }
}
