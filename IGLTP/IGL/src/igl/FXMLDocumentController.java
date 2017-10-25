 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpigl;

import com.sun.media.sound.AlawCodec;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
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
    private RadioButton Join;
    
    @FXML
    private RadioButton Frac;
     
    @FXML
    void FactAction(ActionEvent event) {
           Supp.setSelected(false);
           Text.setSelected(false);
           Occ.setSelected(false);
           Remplacer.setSelected(false);
           Join.setSelected(false);
           info.setDisable(false);
           

    }
    
       @FXML
    void JoinOnAction(ActionEvent event) {
           Supp.setSelected(false);
           Text.setSelected(false);
           Occ.setSelected(false);
           Remplacer.setSelected(false);
           Frac.setSelected(false);
           info.setDisable(false);
    }
    
    @FXML
    void RemAcrion(ActionEvent event) {
           Supp.setSelected(false);
           Text.setSelected(false);
           Occ.setSelected(false);
           Frac.setSelected(false);
           Join.setSelected(false);
           info.setDisable(false);
           info2.setDisable(false);
    }

    @FXML
    void TextAction(ActionEvent event) {
           Supp.setSelected(false);
           Remplacer.setSelected(false);
           Occ.setSelected(false);
           info.setDisable(true);
           info2.setDisable(true);
           Frac.setSelected(false);
           Join.setSelected(false);
   
    }

    @FXML
    void SuppAction(ActionEvent event) {
           Remplacer.setSelected(false);
           Text.setSelected(false);
           Occ.setSelected(false);
           info.setDisable(true);
           info2.setDisable(true);
           Frac.setSelected(false);
           Join.setSelected(false);
           
           
    }

    @FXML
    void OccAction(ActionEvent event) {
           Supp.setSelected(false);
           Text.setSelected(false);
           Remplacer.setSelected(false);
           info.setDisable(false);
           info2.setDisable(true);
           
           Frac.setSelected(false);
           Join.setSelected(false);
    }

    Test t = new Test();
    String s = new String();
    @FXML
    void AffAction(ActionEvent event) {
            if(Remplacer.isSelected()){
               s= t.Remplacer(Ph.getText(), info.getText().charAt(0), info2.getText().charAt(0));
                Alert a = new Alert(Alert.AlertType.INFORMATION, s, ButtonType.OK);
                a.show();
            }
            if(Text.isSelected()){
                s=t.Maj(Ph.getText());
                Alert a = new Alert(Alert.AlertType.INFORMATION, s, ButtonType.OK);
                a.show();
            }
            if(Join.isSelected()){
                
            }
            if(Supp.isSelected()){
                
            }
            if(Frac.isSelected()){
                
            }
            if(Occ.isSelected()){
                
            }
           
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
