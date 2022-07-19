
package org.diegosolis.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *Programador
 * Diego Fernando Solis Lopez
 *  2018306  IN5AM
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnIgual;
    @FXML private Button btnSuma;
    @FXML private Button btnResta;
    @FXML private Button btnMultiplicacions;
    @FXML private Button btnDivision;
    @FXML private Button btnC;
    @FXML private Button btnCE;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnMasmenos;
    @FXML private Button btnXY;
    @FXML private Button btnABS;
    @FXML private Button btnRaiz;
    @FXML private TextField txtPantalla;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource()==btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    }
    

