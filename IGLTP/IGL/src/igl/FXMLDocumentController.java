/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igl;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;


import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author yahia
 */
public class FXMLDocumentController implements Initializable {
    
   @FXML
    private RadioButton Remplacer;

    @FXML
    private RadioButton Supp;

    @FXML
    private TextField Ph;

    @FXML
    private RadioButton Text;

    @FXML
    private RadioButton Occ;

    @FXML
    private TextField info;

    @FXML
    private TextField info2;

    @FXML
    private Button Aficher;
    
    @FXML
    void RemAcrion(ActionEvent event) {

    }

    @FXML
    void TextAction(ActionEvent event) {

    }

    @FXML
    void SuppAction(ActionEvent event) {
 
    }

    @FXML
    void OccAction(ActionEvent event) {

    }

  
    @FXML
    void AffAction(ActionEvent event) {
           
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
